package ch.compiler.AST.expression.nonConstant.binary.rel;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;

public abstract class RelExprNode extends BinaryExprNode {

    public RelExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

}
