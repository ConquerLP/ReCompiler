package ch.compiler.AST.expression.nonConstant.binary.assign;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class AssignExpoExprNode extends AssignExprNode {
    public AssignExpoExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "";
    }
}
