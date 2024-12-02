package ch.compiler.AST.statement;

import ch.compiler.AST.expression.nonConstant.binary.op.OrExprNode;

public class CheckNode {

    private final OrExprNode condition;

    public CheckNode(OrExprNode condition) {
        this.condition = condition;
    }

}
