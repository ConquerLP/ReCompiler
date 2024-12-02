package ch.compiler.AST.statement.jumps.goTo;

import ch.compiler.AST.statement.StatementNode;

public class GotoNode extends StatementNode {

    private final String target;

    public GotoNode(String target) {
        this.target = target;
    }

}
