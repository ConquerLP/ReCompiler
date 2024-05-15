package ch.compiler.misc.nodes.expression.access;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class IndexAccessExpression extends AccessExp{

    public IndexAccessExpression(int type) {
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
