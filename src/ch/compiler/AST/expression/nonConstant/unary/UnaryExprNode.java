package ch.compiler.AST.expression.nonConstant.unary;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public abstract class UnaryExprNode extends ExprNode {

    protected final ExprNode expr;

    public UnaryExprNode(ExprNode expr) {
        this.expr = expr;
    }

}
