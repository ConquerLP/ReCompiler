package ch.compiler.AST.statement.loop;

import ch.compiler.AST.statement.CheckNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.block.LoopBlock;

public class WhileNode extends StatementNode {

    private final CheckNode condition;
    private final LoopBlock block;

    public WhileNode(CheckNode condition, LoopBlock block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public String toString(int depth) {
        final int deeper = depth + 1;
        return " ".repeat(depth) + "While"
                + position + "\n"
                + condition.toString(deeper) + "\n"
                + block.toString(deeper);
    }

}
