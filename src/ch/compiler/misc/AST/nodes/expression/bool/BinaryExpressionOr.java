package ch.compiler.misc.AST.nodes.expression.bool;

import ch.compiler.misc.AST.nodes.expression.BinaryExpression;
import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class BinaryExpressionOr extends BinaryExpression {

    public BinaryExpressionOr(ExpressionNode left, ExpressionNode right) {
        super(left, right, BOOLEAN);
    }

    @Override
    public ExpressionNode evaluate() {
        return null;
    }
}
