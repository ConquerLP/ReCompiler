package ch.compiler.misc.nodes.expression.unary;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class PostIncExpression extends UnaryExpression {

    public PostIncExpression(int type, ExpressionNode exp) {
        super(type, exp);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }

    @Override
    public int evaluateType() {
        return 0;
    }
}
