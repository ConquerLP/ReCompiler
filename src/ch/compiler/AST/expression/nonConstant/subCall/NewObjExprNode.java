package ch.compiler.AST.expression.nonConstant.subCall;

public class NewObjExprNode extends SubCallExprNode {

    public NewObjExprNode(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "New: " + super.toString();
    }

    @Override
    public String toString(int depth) {
        return this.toString();
    }
}
