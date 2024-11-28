package ch.compiler.AST.expression.nonConstant.access;

public class MemberExprNode extends AccessExprNode {

    public boolean evaluate() {
        return false;
    }
}
