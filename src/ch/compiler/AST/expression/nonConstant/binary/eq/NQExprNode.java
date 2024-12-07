package ch.compiler.AST.expression.nonConstant.binary.eq;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class NQExprNode extends EqualityExprNode {
    public NQExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

}
