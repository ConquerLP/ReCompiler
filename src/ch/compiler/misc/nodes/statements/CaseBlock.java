package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class CaseBlock extends Statement {

    private Block block;
    private ExpressionNode expressionNode;

    public CaseBlock(ExpressionNode expressionNode, Block block) {
        this.expressionNode = expressionNode;
        this.block = block;
    }

    public CaseBlock(Block block) {
        this.block = block;
    }



}
