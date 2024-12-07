package ch.compiler.AST.expression.nonConstant.binary.eq;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;

public abstract class EqualityExprNode extends BinaryExprNode {

    public EqualityExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

}
