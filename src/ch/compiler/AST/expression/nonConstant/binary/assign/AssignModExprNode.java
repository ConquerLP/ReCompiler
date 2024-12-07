package ch.compiler.AST.expression.nonConstant.binary.assign;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class AssignModExprNode extends AssignExprNode {
    public AssignModExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }
}
