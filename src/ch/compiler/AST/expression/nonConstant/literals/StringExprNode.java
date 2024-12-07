package ch.compiler.AST.expression.nonConstant.literals;


public class StringExprNode extends ConstantExprNode {

    private final String value;

    public StringExprNode(String value) {
        this.value = value;
    }

}
