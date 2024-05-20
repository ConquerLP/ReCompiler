package ch.compiler.misc.AST.nodes.expression.math;

import ch.compiler.misc.AST.nodes.expression.BinaryExpression;
import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class ExpressionSub extends BinaryExpression {

    public ExpressionSub(ExpressionNode left, ExpressionNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
