package ch.compiler.AST.expression.nonConstant.list;

import ch.compiler.AST.expression.nonConstant.ExprNode;

import java.util.ArrayList;
import java.util.List;

public class ListExprNode extends ExprNode {

    private final List<ExprNode> expressions = new ArrayList<>();

    public void addExpression(ExprNode expression) {
        expressions.add(expression);
    }

    public void addExpressions(List<ExprNode> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public String toString() {
        return "";
    }
}
