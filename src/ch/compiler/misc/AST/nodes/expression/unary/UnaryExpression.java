package ch.compiler.misc.AST.nodes.expression.unary;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public abstract class UnaryExpression extends ExpressionNode {

    private ExpressionNode exp;

    public UnaryExpression(int type, ExpressionNode exp) {
        super(type);
        this.exp = exp;
    }



}
