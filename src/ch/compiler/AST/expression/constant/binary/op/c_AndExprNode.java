package ch.compiler.AST.expression.constant.binary.op;

import ch.compiler.AST.expression.constant.c_ExprNode;

public class c_AndExprNode extends c_OpExprNode {
    public c_AndExprNode(c_ExprNode left, c_ExprNode right) {
        super(left, right);
    }
}
