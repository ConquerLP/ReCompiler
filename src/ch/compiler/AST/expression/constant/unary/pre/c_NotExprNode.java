package ch.compiler.AST.expression.constant.unary.pre;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_NotExprNode extends c_PreExprNode {

    public c_NotExprNode(c_ExprNode expr) {
        super(expr);
    }

    @Override
    public String toString() {
        return "";
    }
}
