package ch.compiler.AST.statement.jumps.function;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class ReturnNode extends FunctionJump {

    private final ExprNode expr;

    public ReturnNode () {
        this.expr = null;
    }

    public ReturnNode(ExprNode expr) {
        this.expr = expr;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(depth)).append("Return").append(position);
        if (expr != null) {
            sb.append(expr);
        } else {
            sb.append("void");
        }
        return sb.append("\n").toString();
    }

}
