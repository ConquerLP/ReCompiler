package ch.compiler.AST.expression.nonConstant.access;

public class ThisExprNode extends AccessExprNode {

    public boolean evaluate() {
        return false;
    }
}
