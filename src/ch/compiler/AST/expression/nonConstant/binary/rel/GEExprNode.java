package ch.compiler.AST.expression.nonConstant.binary.rel;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class GEExprNode extends RelExprNode {

    public GEExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }

}
