package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryClass extends SymbolTableEntry {

    private SymbolTable insides;

    public EntryClass(String name, Type type) {
        super(name, type);
    }

    public void add(SymbolTableEntry entry) {
        insides.add(entry);
    }
}
