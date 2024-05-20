package ch.compiler.misc.AST.nodes.expression.literals;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class BooleanLiteral extends ExpressionNode {

    private final Boolean value;

    public BooleanLiteral(Boolean value) {
        super(BOOLEAN);
        this.value = value;
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public Boolean getValue() {
        return value;
    }

    public int evaluateType() {
        return BOOLEAN;
    }
}
