package ch.compiler.AST.expression.nonConstant.access;

import ch.compiler.AST.expression.nonConstant.ExprNode;

import java.util.ArrayList;
import java.util.List;

public abstract class AccessExprNode extends ExprNode {

    protected final List<ExprNode> expressions = new ArrayList<>();

    public void addExpression(ExprNode expr) {
        expressions.add(expr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        expressions.forEach(e -> sb.append("[ ").append(e).append(" ]"));
        return sb.toString();
    }

}
