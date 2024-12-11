package ch.compiler.AST.expression.constant.literals;

public class c_StringExprNode extends c_ConstantExprNode {

    private final String value;

    public c_StringExprNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
