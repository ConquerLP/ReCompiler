package ch.compiler.misc.AST.nodes.expression.literals;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class CharacterLiteral extends ExpressionNode {

    private final Character value;

    public CharacterLiteral(Character value) {
        super(CHAR);
        this.value = value;
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public Character getValue() {
        return value;
    }

    public int evaluateType() {
        return CHAR;
    }
}
