package ch.compiler.AST.expression.constant.binary.op;

import ch.compiler.AST.expression.constant.binary.c_BinaryExprNode;
import ch.compiler.AST.expression.constant.c_ExprNode;

public abstract class c_OpExprNode extends c_BinaryExprNode {

    public c_OpExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }
}
