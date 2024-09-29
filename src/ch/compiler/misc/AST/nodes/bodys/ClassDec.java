package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.symbolTable.*;

import java.util.ArrayList;
import java.util.List;

public class ClassDec implements SymbolEntry, Resolvable {

    private SymbolTable symbols;
    private List<ClassMethod> methods;
    private List<ClassConstructor> constructors;
    private List<String> superClasses;
    private String className;

    public ClassDec(String className) {
        this.className = className;
        symbols = new SymbolTable();
        methods = new ArrayList<>();
        constructors = new ArrayList<>();
        superClasses = new ArrayList<>();
    }

    @Override
    public SymbolTableEntry toEntry() {
        return new EntryClass(className, new Type(DataType.CLASS.toString()));
    }

    public void add(List<ClassInside> classInside) {
        classInside.forEach(this::add);
    }

    public void add(ClassInside classInside) {
        if (classInside instanceof ClassMethod) {
            addMethod((ClassMethod) classInside);
        } else if (classInside instanceof ClassConstructor) {
            addConstructor((ClassConstructor) classInside);
        }
    }

    private void addMethod(ClassMethod method) {
        methods.add(method);
    }

    private void addConstructor(ClassConstructor constructor) {
        constructors.add(constructor);
    }

    public void addSuperClass(List<String> superClass) {
        superClasses.addAll(superClass);
    }

    @Override
    public void resolve(SymbolTable table) throws RuntimeException {

    }
}
