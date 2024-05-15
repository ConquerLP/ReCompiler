package ch.compiler.misc.nodes.expression.literals;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral extends ConstExpNode {

    private final List<ConstExpNode> values;
    private final int arrayType;

    public ArrayLiteral(ConstExpNode initialValue) {
        super(ARRAY);
        this.arrayType = initialValue.evaluateType();
        values = new ArrayList<>();
         values.add(initialValue);
    }

    public void add(ConstExpNode value) {
        if (value.evaluateType() != arrayType) {
            throw new RuntimeException("");
        } else {
            values.add(value);
        }
    }

    @Override
    public ConstExpNode evaluate() {
        return this;
    }

    public List<ConstExpNode> getValue() {
        return values;
    }

    @Override
    public int evaluateType() {
        return ARRAY;
    }

    public int getArrayType() {
        return arrayType;
    }

    public int getDim() {
        return 0;
    }

    public int lengthOfNDim(int dim) {
        return 0;
    }
}
