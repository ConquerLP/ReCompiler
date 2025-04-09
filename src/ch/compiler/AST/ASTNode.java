package ch.compiler.AST;

import ch.compiler.utils.Position;

public abstract class ASTNode {

    protected Position position;

    public abstract String toString(int depth);

    public void setPosition(Position position) {
        this.position = position;
    }

}
