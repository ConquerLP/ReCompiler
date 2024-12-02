package ch.compiler.AST.statement.loop;

import ch.compiler.AST.statement.CheckNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.block.LoopBlock;

public class DoWhileNode extends StatementNode {

    private final CheckNode condition;
    private final LoopBlock block;

    public DoWhileNode(CheckNode condition, LoopBlock block) {
        this.condition = condition;
        this.block = block;
    }

}
