package ch.compiler.AST.expression.constant.binary.eq;

import ch.compiler.AST.expression.constant.binary.c_BinaryExprNode;
import ch.compiler.AST.expression.constant.c_ExprNode;

public abstract class c_EqExprNodeAbs extends c_BinaryExprNode {

    public c_EqExprNodeAbs(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }

}
