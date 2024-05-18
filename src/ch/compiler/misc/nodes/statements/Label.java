package ch.compiler.misc.nodes.statements;

public class Label extends Statement {

    private String id;
    private Block block;

    public Label(Block block, String id) {
        this.block = block;
        this.id = id;
    }

}
