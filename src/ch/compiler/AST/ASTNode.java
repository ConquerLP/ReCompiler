package ch.compiler.AST;

import ch.compiler.utils.Position;

import java.io.IOException;

public abstract class ASTNode {

    protected Position position;

    public abstract void dumpTree(Appendable out, int depth) throws IOException;

    public void setPosition(Position position) {
        this.position = position;
    }

    private String indent(int depth) {
        return "  ".repeat(depth);
    }

    protected void prefix(Appendable out, int depth) throws IOException {
        out.append(indent(depth));
    }

}
