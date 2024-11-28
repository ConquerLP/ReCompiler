package ch.compiler.AST.expression.nonConstant.access;

public class VarExprNode extends AccessExprNode {

    public boolean evaluate() {
        return false;
    }
}
