package ch.compiler.AST.expression.constant.unary;

import ch.compiler.AST.expression.constant.c_ExprNode;

public abstract class c_UnaryExprNode extends c_ExprNode {

    protected final c_ExprNode expr;

    public c_UnaryExprNode(c_ExprNode expr) {
        this.expr = expr;
    }

}
