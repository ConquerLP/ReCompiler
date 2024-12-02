package ch.compiler.AST.statement.block;

import ch.compiler.AST.statement.StatementNode;

import java.util.ArrayList;
import java.util.List;

public class LoopBlock {

    private final List<StatementNode> statements = new ArrayList<>();

    public void addStatement(StatementNode statement) {
        statements.add(statement);
    }

}
