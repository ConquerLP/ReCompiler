package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryClass extends SymbolTableEntry {

    private SymbolTable insides;

    public EntryClass(String name, Type type) {
        super(name, type);
    }

    public void add(SymbolTableEntry entry) {
        insides.add(entry);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof EntryClass)) return false;
        if(this == obj) return true;
        return name.equals(((EntryClass) obj).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
