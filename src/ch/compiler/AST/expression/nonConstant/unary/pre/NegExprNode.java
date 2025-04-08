package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class NegExprNode extends PreExprNode {

    public NegExprNode(ExprNode expr) {
        super(expr);
    }

    @Override
    public String toString(int depth) {
        return "- " + expr;
    }

}
