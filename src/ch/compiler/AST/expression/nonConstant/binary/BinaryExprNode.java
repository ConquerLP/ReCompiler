package ch.compiler.AST.expression.nonConstant.binary;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public abstract class BinaryExprNode extends ExprNode {

    protected final ExprNode left;
    protected final ExprNode right;

    public BinaryExprNode(ExprNode left, ExprNode right) {
        this.left = left;
        this.right = right;
    }

}
