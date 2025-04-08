package ch.compiler.AST.statement;

import ch.compiler.AST.ASTNode;
import ch.compiler.utils.Position;

public abstract class StatementNode extends ASTNode {

    public StatementNode(Position position) {
        super(position);
    }

}
