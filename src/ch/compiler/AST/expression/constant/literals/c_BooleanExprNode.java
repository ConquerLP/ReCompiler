package ch.compiler.AST.expression.constant.literals;

public class c_BooleanExprNode extends c_ConstantExprNode {

    private final boolean value;

    public c_BooleanExprNode(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
