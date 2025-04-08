package ch.compiler.AST.expression.constant.list;

import ch.compiler.AST.expression.constant.c_ExprNode;

import java.util.ArrayList;
import java.util.List;

public class c_ListExprNode extends c_ExprNode {

    private final List<c_ExprNode> expressions = new ArrayList<>();

    public void addExpressions(List<c_ExprNode> expression) {
        expressions.addAll(expression);
    }

    public void addExpression(c_ExprNode expression) {
        expressions.add(expression);
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append("List:\t");
        expressions.forEach(e -> sb.append(e.toString()).append("\t"));
        return sb.toString();
    }

}
