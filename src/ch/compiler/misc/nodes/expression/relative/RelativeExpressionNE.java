package ch.compiler.misc.nodes.expression.relative;

import ch.compiler.misc.nodes.expression.BinaryExpression;
import ch.compiler.misc.nodes.expression.ExpressionNode;

public class RelativeExpressionNE extends BinaryExpression {


    public RelativeExpressionNE(ExpressionNode left, ExpressionNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
