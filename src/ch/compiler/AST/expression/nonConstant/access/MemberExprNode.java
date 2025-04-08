package ch.compiler.AST.expression.nonConstant.access;

public class MemberExprNode extends AccessExprNode {

    private final String member;

    public MemberExprNode(String member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "." + member + super.toString();
    }

    @Override
    public String toString(int depth) {
       return this.toString();
    }

}
