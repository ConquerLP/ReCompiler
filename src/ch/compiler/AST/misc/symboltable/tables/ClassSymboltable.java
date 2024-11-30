package ch.compiler.AST.misc.symboltable.tables;

import ch.compiler.AST.misc.symboltable.entry.ClassEntry;
import ch.compiler.AST.misc.symboltable.entry.SymboltableEntry;
import ch.compiler.AST.misc.symboltable.entry.subCall.ConstructorEntry;
import ch.compiler.AST.misc.symboltable.entry.subCall.MethodEntry;
import ch.compiler.AST.misc.symboltable.entry.varEntry.MemberEntry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClassSymboltable extends Symboltable {

    private final Map<String, MemberEntry> fields = new HashMap<>();
    private final Map<String, MethodEntry> methods = new HashMap<>();
    private final Map<String, ConstructorEntry> constructors = new HashMap<>();
    private final Map<String, ClassEntry> superClasses = new HashMap<>();

    public ClassSymboltable(Symboltable parent) {
        super(parent);
    }

    public Collection<MethodEntry> getMethod() {
        return methods.values();
    }

    public Collection<ConstructorEntry> getConstructors() {
        return constructors.values();
    }

    @Override
    public void add(SymboltableEntry entry) {
        if (entry instanceof MemberEntry) {
            fields.put(entry.getName(), (MemberEntry) entry);
        } else if (entry instanceof MethodEntry) {
            methods.put(entry.getName(), (MethodEntry) entry);
        } else if (entry instanceof ConstructorEntry) {
            constructors.put(entry.getName(), (ConstructorEntry) entry);
        } else if (entry instanceof ClassEntry) {
            superClasses.put(entry.getName(), (ClassEntry) entry);
        }
    }

    @Override
    public SymboltableEntry lookup(String name) {
        if (fields.containsKey(name)) {
            return fields.get(name);
        } else if (methods.containsKey(name)) {
            return methods.get(name);
        } else if (constructors.containsKey(name)) {
            return constructors.get(name);
        } else {
            if (!superClasses.isEmpty()) {
                for (ClassEntry superClass : superClasses.values()) {
                    SymboltableEntry entry = superClass.getSymboltable().lookup(name);
                    if (entry != null) {
                        return entry;
                    }
                }
            }
            return null;
        }
    }

    public ClassEntry lookupSuperClass(String name) {
        return superClasses.get(name);
    }

}
