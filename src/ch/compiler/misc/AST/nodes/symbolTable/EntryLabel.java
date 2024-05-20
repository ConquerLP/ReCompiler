package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryLabel extends SymbolTableEntry {

    public EntryLabel(String name) {
        super(name, new Type(DataType.VOID.toString()));
    }

}
