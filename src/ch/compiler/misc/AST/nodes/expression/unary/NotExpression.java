package ch.compiler.misc.AST.nodes.expression.unary;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class NotExpression extends UnaryExpression {

    public NotExpression(int type, ExpressionNode exp) {
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
