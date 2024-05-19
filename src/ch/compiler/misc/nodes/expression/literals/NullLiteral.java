package ch.compiler.misc.nodes.expression.literals;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class NullLiteral extends PointerLiteral {

    public NullLiteral() {
        super(ExpressionNode.NULL);
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public int evaluateType() {
        return NULL;
    }

}
