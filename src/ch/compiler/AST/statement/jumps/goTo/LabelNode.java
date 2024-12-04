package ch.compiler.AST.statement.jumps.goTo;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.block.FunctionBlock;

public class LabelNode extends StatementNode {

    private final String label;
    private final FunctionBlock block;

    public LabelNode(String label, FunctionBlock block) {
        this.label = label;
        this.block = block;
    }

}
