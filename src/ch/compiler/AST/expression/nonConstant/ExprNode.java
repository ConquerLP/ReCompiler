package ch.compiler.AST.expression.nonConstant;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.utils.Position;

public abstract class ExprNode extends StatementNode {

    public ExprNode(Position position) {
        super(position);
    }

}
