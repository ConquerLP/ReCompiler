package ch.compiler.AST.expression.nonConstant.subCall;

public class fCallExprNode extends SubCallExprNode {

    public fCallExprNode(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "FunctionCall: " + super.toString();
    }

    @Override
    public String toString(int depth) {
        return this.toString();
    }

}
