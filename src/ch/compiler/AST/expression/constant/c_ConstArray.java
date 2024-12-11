package ch.compiler.AST.expression.constant;

public class c_ConstArray extends c_ExprNode {

    private c_ExprNode expr;

    public c_ConstArray(c_ExprNode expr) {
        this.expr = expr;
    }

    public c_ConstArray() {}

    public void setExpr(c_ExprNode expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "";
    }
}
