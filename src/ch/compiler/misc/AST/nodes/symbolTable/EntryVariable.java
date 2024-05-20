package ch.compiler.misc.AST.nodes.symbolTable;


public class EntryVariable extends SymbolTableEntry {

    private final Type type;

    public EntryVariable(String name, Type type) {
        super(name, type);
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

}
