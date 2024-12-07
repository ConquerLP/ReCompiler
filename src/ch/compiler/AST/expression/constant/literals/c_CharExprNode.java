package ch.compiler.AST.expression.constant.literals;

public class c_CharExprNode extends c_ConstantExprNode {

    private final char value;

    public c_CharExprNode(char value) {
        this.value = value;
    }

}
