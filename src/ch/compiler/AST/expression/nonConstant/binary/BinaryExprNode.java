package ch.compiler.AST.expression.nonConstant.binary;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.utils.Position;

public abstract class BinaryExprNode extends ExprNode {

    protected final ExprNode left;
    protected final ExprNode right;

    public BinaryExprNode(ExprNode left, ExprNode right, Position pos) {
        super(pos);
        this.left = left;
        this.right = right;
    }

}
