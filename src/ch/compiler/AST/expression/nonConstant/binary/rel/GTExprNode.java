package ch.compiler.AST.expression.nonConstant.binary.rel;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class GTExprNode extends RelExprNode {


    public GTExprNode(ExprNode left, ExprNode right) {
        super(left, right);
    }
}
