package ch.compiler.misc.AST.nodes.expression.unary;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class NegateExpression extends UnaryExpression {

    public NegateExpression(int type, ExpressionNode exp) {
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