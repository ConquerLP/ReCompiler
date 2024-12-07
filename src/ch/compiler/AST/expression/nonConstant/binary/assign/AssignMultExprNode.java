package ch.compiler.AST.expression.nonConstant.binary.assign;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class AssignMultExprNode extends AssignExprNode {
    public AssignMultExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }
}
