package ch.compiler.AST.expression.nonConstant.binary.rel;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class LTExprNode extends RelExprNode {

    public LTExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return left + " < " + right;
    }

    @Override
    public String toString(int depth) {
        return this.toString();
    }

}
