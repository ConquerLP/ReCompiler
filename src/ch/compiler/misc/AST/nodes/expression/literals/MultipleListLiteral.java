package ch.compiler.misc.AST.nodes.expression.literals;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class MultipleListLiteral extends ExpressionNode {

    private final List<List<ExpressionNode>> values = new ArrayList<>();
    private int arrayType;

    public MultipleListLiteral() {
        super(ARRAY);
    }

    public void add(List<ExpressionNode> value) {
        if (values.isEmpty()) {
            arrayType = value.getFirst().evaluateType();
        }
        if(!checkType(value)) {
            throw new RuntimeException("All elements in a list must have the same type");
        }
        values.add(value);
    }

    private boolean checkType(List<ExpressionNode> value) {
        for (ExpressionNode expressionNode : value) {
            if (expressionNode.evaluateType() != arrayType) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ExpressionNode evaluate() {
        return this;
    }

    public List<List<ExpressionNode>> getValues() {
        return values;
    }

    @Override
    public int evaluateType() {
        return ARRAY;
    }

}
