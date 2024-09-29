package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.symbolTable.*;

public class Label extends Statement implements SymbolEntry, Resolvable {

    private String id;
    private Block block;

    public Label(Block block, String id) {
        this.block = block;
        this.id = id;
    }

    @Override
    public SymbolTableEntry toEntry() {
        return new EntryLabel(id);
    }

    @Override
    public void resolve(SymbolTable table) throws RuntimeException {

    }
}
