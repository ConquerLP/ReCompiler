package ch.compiler.AST.expression.constant.unary.pre;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_PlusExprNode extends c_PreExprNode {

    public c_PlusExprNode(c_ExprNode expr) {
        super(expr);
    }

    @Override
    public String toString() {
        return "";
    }
}
