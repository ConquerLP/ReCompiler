package ch.compiler.misc.nodes.expression.literals;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class DoubleLiteral extends ExpressionNode {

    private final Double value;

    public DoubleLiteral(Double value) {
        super(DOUBLE);
        this.value = value;
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public Double getValue() {
        return value;
    }

    public int evaluateType() {
        return DOUBLE;
    }
}
