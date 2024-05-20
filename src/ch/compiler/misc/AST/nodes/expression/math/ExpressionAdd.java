package ch.compiler.misc.AST.nodes.expression.math;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.expression.BinaryExpression;

public class ExpressionAdd extends BinaryExpression {

    public ExpressionAdd(ExpressionNode left, ExpressionNode right, int type) {
        super(left, right, type);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
