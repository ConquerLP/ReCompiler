package ch.compiler.AST.expression.constant.unary.pre;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.expression.constant.unary.c_UnaryExprNode;

public abstract class c_PreExprNode extends c_UnaryExprNode {
    public c_PreExprNode(c_ExprNode expr) {
        super(expr);
    }
}
