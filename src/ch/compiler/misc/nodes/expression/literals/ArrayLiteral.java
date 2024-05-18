package ch.compiler.misc.nodes.expression.literals;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral extends ConstExpNode {

    private final List<ConstExpNode> values = new ArrayList<>();
    private int arrayType;

    public ArrayLiteral(ConstExpNode initialValue) {
        super(ARRAY);
        this.arrayType = initialValue.evaluateType();
        values.add(initialValue);
    }

    public ArrayLiteral() {
        super(ARRAY);
    }

    public void add(ConstExpNode value) {
        if(values.isEmpty()) {
            arrayType = value.evaluateType();
        }
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

}
