package ch.compiler.AST.expression.nonConstant.binary.eq;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class EQExprNode extends EqualityExprNode {
    public EQExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "";
    }
}
