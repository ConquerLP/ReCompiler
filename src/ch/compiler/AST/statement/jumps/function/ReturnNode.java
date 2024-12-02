package ch.compiler.AST.statement.jumps.function;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.statement.StatementNode;

public class ReturnNode extends StatementNode {

    private final ExprNode expr;

    public ReturnNode () {
        this.expr = null;
    }

    public ReturnNode(ExprNode expr) {
        this.expr = expr;
    }

}
