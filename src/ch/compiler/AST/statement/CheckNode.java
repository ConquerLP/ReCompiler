package ch.compiler.AST.statement;

import ch.compiler.AST.expression.nonConstant.ExprNode;

public class CheckNode {

    private final ExprNode condition;

    public CheckNode(ExprNode condition) {
        this.condition = condition;
    }

}
