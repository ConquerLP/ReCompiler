package ch.compiler.AST.expression.constant.literals;

public class c_IntExprNode extends c_ConstantExprNode {

    private final int value;

    public c_IntExprNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
