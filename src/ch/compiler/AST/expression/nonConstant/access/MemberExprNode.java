package ch.compiler.AST.expression.nonConstant.access;

public class MemberExprNode extends AccessExprNode {

    private final String member;

    public MemberExprNode(String member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "";
    }
}
