package ch.compiler.misc.nodes.expression.math;

import ch.compiler.misc.nodes.expression.BinaryExpression;
import ch.compiler.misc.nodes.expression.ExpressionNode;

public class ExpressionSub extends BinaryExpression {

    public ExpressionSub(ExpressionNode left, ExpressionNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
