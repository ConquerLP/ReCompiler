package ch.compiler.AST.expression.nonConstant.unary.pre;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class PlusExprNode extends PreExprNode {

    public PlusExprNode(ExprNode expr) {
        super(expr);
    }

    @Override
    public String toString(int depth) {
        return "+ " + expr;
    }

}
