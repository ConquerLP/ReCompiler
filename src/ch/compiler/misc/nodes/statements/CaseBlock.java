package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class CaseBlock extends Statement {

    private Block block;
    private ConstExpNode constantExpression;

    public CaseBlock(ConstExpNode constantExpression, Block block) {
        this.constantExpression = constantExpression;
        this.block = block;
    }

    public CaseBlock(Block block) {
        this.block = block;
    }



}
