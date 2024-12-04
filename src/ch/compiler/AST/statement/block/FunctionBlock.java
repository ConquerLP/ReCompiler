package ch.compiler.AST.statement.block;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.jumps.loop.LoopJump;

import java.util.ArrayList;
import java.util.List;

public class FunctionBlock extends StatementNode {

    private final List<StatementNode> statements = new ArrayList<>();

    public void addStatement(StatementNode statement) {
        if(statement instanceof LoopJump) {
            throw new IllegalArgumentException("Cannot add LoopJump to FunctionBlock");
        }
        statements.add(statement);
    }

}
