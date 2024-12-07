package ch.compiler.AST.expression.constant.binary;

import ch.compiler.AST.expression.constant.c_ExprNode;

public abstract class c_BinaryExprNode extends c_ExprNode {

    protected c_ExprNode left;
    protected c_ExprNode right;

    public c_BinaryExprNode(c_ExprNode left, c_ExprNode right) {
        this.left = left;
        this.right = right;
    }

}
