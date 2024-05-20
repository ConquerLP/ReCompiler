package ch.compiler.misc.AST.nodes.symbolTable;

public abstract class SymbolTableEntry {

    protected String name;
    protected Type type;

    public SymbolTableEntry(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

}
