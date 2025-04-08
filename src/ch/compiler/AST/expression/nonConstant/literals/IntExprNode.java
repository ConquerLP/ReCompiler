package ch.compiler.AST.expression.nonConstant.literals;


public class IntExprNode extends ConstantExprNode {

    private final int value;

    public IntExprNode(int value) {
        this.value = value;
    }

    @Override
    public String toString(int depth) {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
