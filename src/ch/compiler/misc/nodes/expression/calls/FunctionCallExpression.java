package ch.compiler.misc.nodes.expression.calls;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class FunctionCallExpression extends ExpressionNode {

    public FunctionCallExpression(int type) {
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
