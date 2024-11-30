package ch.compiler.AST.misc.symboltable.entry;

import ch.compiler.AST.misc.symboltable.entry.subCall.ConstructorEntry;
import ch.compiler.AST.misc.symboltable.tables.ClassSymboltable;
import ch.compiler.AST.misc.symboltable.tables.Symboltable;
import ch.compiler.AST.misc.symboltable.entry.subCall.MethodEntry;

import java.util.HashSet;
import java.util.Set;

public class ClassEntry extends SymboltableEntry {

    private ClassEntry superClass;
    private String superClassName = "";
    private final ClassSymboltable symboltable;

    public ClassEntry(String name, Symboltable programSymboltable) {
        super(name);
        symboltable = new ClassSymboltable(programSymboltable);
    }

    public void addSuperClass(String superClassName) {
        this.superClassName = superClassName;
    }

    public Symboltable getSymboltable() {
        return symboltable;
    }

    @Override
    public String toString() {
        if (superClassName.isEmpty()) {
            return "Class: " + name;
        } else {
            return "Class: " + name + " extends: " + superClassName;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClassEntry) {
            return name.equals(((ClassEntry) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public void resolve() {
        if (resolved) return;
        resolveSuper();
        resolveCyclicInheritance();
        symboltable.getMethod().forEach(MethodEntry::resolve);
        symboltable.getConstructors().forEach(ConstructorEntry::resolve);
        resolved = true;
    }

    private void resolveSuper() {
        if (!superClassName.isEmpty()) {
            if(superClassName.equals(name)) {
                throw new IllegalStateException("Class: " + name + " cannot extend itself.");
            }
            SymboltableEntry superClass = symboltable.getParent().lookup(superClassName);
            if (superClass instanceof ClassEntry) {
                this.superClass = (ClassEntry) superClass;
            } else {
                throw new IllegalStateException("Superclass: " + superClassName + " not found.");
            }
        }
    }

    private void resolveCyclicInheritance() {
        Set<ClassEntry> visited = new HashSet<>();
        if (hasCycle(this, visited)) {
            throw new IllegalStateException("Cyclic inheritance in class: " + name + " found.");
        }
    }

    private boolean hasCycle(ClassEntry current, Set<ClassEntry> visited) {
        if (visited.contains(current)) return true;
        if (superClassName.isEmpty()) return false;
        visited.add(current);
        boolean cycleDetected = hasCycle(superClass, visited);
        visited.remove(current);
        return cycleDetected;
    }

}
