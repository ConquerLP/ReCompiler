package ch.compiler.AST.expression.nonConstant.access;

public class ThisExprNode extends AccessExprNode {

    @Override
    public String toString() {
        return "this " + super.toString();
    }

    @Override
    public String toString(int depth) {
        return this.toString();
    }

}
