package ch.compiler.AST.expression.nonConstant.literals;


public class DoubleExprNode extends ConstantExprNode {

    private final Double value;

    public DoubleExprNode(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
