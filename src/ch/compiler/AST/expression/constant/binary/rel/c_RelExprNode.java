package ch.compiler.AST.expression.constant.binary.rel;

import ch.compiler.AST.expression.constant.binary.c_BinaryExprNode;
import ch.compiler.AST.expression.constant.c_ExprNode;

public abstract class c_RelExprNode extends c_BinaryExprNode {
    public c_RelExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }
}
