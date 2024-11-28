package ch.compiler.AST.expression.nonConstant;

import ch.compiler.AST.statement.StatementNode;

public abstract class ExprNode extends StatementNode {
    public abstract boolean evaluate();
}
