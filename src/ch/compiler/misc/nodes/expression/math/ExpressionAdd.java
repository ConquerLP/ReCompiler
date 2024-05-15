package ch.compiler.misc.nodes.expression.math;

import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.expression.BinaryExpression;

public class ExpressionAdd extends BinaryExpression {

    public ExpressionAdd(ExpressionNode left, ExpressionNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
