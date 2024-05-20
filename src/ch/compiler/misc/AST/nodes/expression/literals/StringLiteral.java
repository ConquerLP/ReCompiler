package ch.compiler.misc.AST.nodes.expression.literals;


import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class StringLiteral extends ExpressionNode {

    private final String value;

    public StringLiteral(String value) {
        super(STRING);
        this.value = value;
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public String getValue() {
        return value;
    }

    public int evaluateType() {
        return STRING;
    }
}
