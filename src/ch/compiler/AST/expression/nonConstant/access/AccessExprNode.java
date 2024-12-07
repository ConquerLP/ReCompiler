package ch.compiler.AST.expression.nonConstant.access;

import ch.compiler.AST.expression.nonConstant.ExprNode;

import java.util.ArrayList;
import java.util.List;

public abstract class AccessExprNode extends ExprNode {

    protected final List<ExprNode> expressions = new ArrayList<>();

    public void addExpression(ExprNode expr) {
        expressions.add(expr);
    }

}
