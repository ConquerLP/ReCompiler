package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryFunction extends SymbolTableEntry {

    private SymbolTable inputs;

    public EntryFunction(String name, Type type) {
        super(name, type);
    }

    @Override
    public Type getType() {
        return type;
    }

    public void addInput(EntryVariable entry) {
        inputs.add(entry);
    }

    public SymbolTable getInputs() {
        return inputs;
    }

}
