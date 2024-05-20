package ch.compiler.misc.AST.nodes.expression.literals;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class ListLiteral extends ExpressionNode {

    private final List<ExpressionNode> values = new ArrayList<>();
    private int arrayType;

    public ListLiteral() {
        super(ARRAY);
    }

    public void add(ExpressionNode value) {
        if (values.isEmpty()) {
            arrayType = value.evaluateType();
        }
        if (value.evaluateType() != arrayType) {
            throw new RuntimeException("");
        } else {
            values.add(value);
        }
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public List<ExpressionNode> getValue() {
        return values;
    }

    @Override
    public int evaluateType() {
        return ARRAY;
    }

}
