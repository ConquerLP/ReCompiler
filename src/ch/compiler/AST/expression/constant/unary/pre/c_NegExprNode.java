package ch.compiler.AST.expression.constant.unary.pre;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_NegExprNode extends c_PreExprNode {

    public c_NegExprNode(c_ExprNode expr) {
        super(expr);
    }
}
