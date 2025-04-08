package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class NotExprNode extends PreExprNode {

    public NotExprNode(ExprNode expr) {
        super(expr);
    }

    @Override
    public String toString(int depth) {
        return "not " + expr;
    }

}
