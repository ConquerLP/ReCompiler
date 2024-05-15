package ch.compiler.misc.nodes.expression.calls;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class MethodCallExpression extends ExpressionNode {

    public MethodCallExpression(int type) {
        super(type);
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
