package ch.compiler.misc.AST.nodes.expression.math;

import ch.compiler.misc.AST.nodes.expression.BinaryExpression;
import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class ExpressionDiv extends BinaryExpression {

    public ExpressionDiv(ExpressionNode left, ExpressionNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
