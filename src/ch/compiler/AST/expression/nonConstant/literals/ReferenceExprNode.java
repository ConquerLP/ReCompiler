package ch.compiler.AST.expression.nonConstant.literals;


public class ReferenceExprNode extends ConstantExprNode {

    public final static int NULL = 0;
    private final int value;

    public ReferenceExprNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }
}
