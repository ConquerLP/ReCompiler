package ch.compiler.AST.expression.nonConstant.binary.assign;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class AssignMinusExprNode extends AssignExprNode {

    public AssignMinusExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return left + " -= " + right;
    }

    @Override
    public String toString(int depth) {
        return this.toString();
    }

}
