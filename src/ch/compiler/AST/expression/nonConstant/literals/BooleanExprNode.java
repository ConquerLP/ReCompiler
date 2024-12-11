package ch.compiler.AST.expression.nonConstant.literals;


public class BooleanExprNode extends ConstantExprNode {

    private final boolean value;

    public BooleanExprNode(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
