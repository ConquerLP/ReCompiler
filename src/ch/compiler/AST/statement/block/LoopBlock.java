package ch.compiler.AST.statement.block;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.statement.StatementNode;

import java.util.ArrayList;
import java.util.List;

public class LoopBlock extends ASTNode {

    private final List<StatementNode> statements = new ArrayList<>();

    public void addStatement(StatementNode statement) {
        statements.add(statement);
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        sb.append(" ".repeat(depth)).append("LoopBlock:\n");
        if(!statements.isEmpty()) {
            statements.forEach(s -> sb.append(s.toString(deeper)).append("\n"));
        } else {
            sb.append(" ".repeat(deeper)).append("No statement(s)\n");
        }
        return sb.toString();
    }

}
