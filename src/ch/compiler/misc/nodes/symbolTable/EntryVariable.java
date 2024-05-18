package ch.compiler.misc.nodes.symbolTable;


public class EntryVariable extends SymbolTableEntry {

    private final Type type;
    //private Value initialValue;

    public EntryVariable(String name, Type type) {
        super(name);
        this.type = type;
    }

    public Type getDataType() {
        return type;
    }

}
