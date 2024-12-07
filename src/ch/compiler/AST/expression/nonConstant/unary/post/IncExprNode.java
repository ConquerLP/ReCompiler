package ch.compiler.AST.expression.nonConstant.unary.post;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class IncExprNode extends PostExprNode {

    public IncExprNode(ExprNode expr) {
        super(expr);
    }
}
