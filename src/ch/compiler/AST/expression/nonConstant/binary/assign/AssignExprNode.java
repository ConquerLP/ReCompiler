package ch.compiler.AST.expression.nonConstant.binary.assign;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;

public abstract class AssignExprNode extends BinaryExprNode {

    public AssignExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }
}
