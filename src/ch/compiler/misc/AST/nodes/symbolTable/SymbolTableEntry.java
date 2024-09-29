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

    @Override
    public boolean equals(Object obj) {
        SymbolTableEntry entry = (SymbolTableEntry) obj;
        return name.equals(entry.getName()) && type.equals(entry.getType());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

}