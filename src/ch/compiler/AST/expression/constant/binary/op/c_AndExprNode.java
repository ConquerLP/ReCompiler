package ch.compiler.AST.expression.constant.binary.op;

import ch.compiler.AST.expression.constant.binary.c_BinaryExprNode;

public class c_AndExprNode extends c_BinaryExprNode {
    public boolean evaluate() {
        return false;
    }
}