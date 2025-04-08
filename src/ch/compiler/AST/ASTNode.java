package ch.compiler.AST;

import ch.compiler.utils.Position;

public abstract class ASTNode {

    protected Position position;

    public ASTNode(Position position) {
        this.position = position;
    }

    public abstract String toString(int depth);

}
