package ch.compiler.AST.expression.nonConstant.literals;


public class CharExprNode extends ConstantExprNode {

    private final char value;

    public CharExprNode(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
