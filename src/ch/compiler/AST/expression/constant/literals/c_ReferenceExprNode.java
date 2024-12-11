package ch.compiler.AST.expression.constant.literals;

public class c_ReferenceExprNode extends c_ConstantExprNode {

   public final static int NULL = 0;
   private final int value;

    public c_ReferenceExprNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }

}
