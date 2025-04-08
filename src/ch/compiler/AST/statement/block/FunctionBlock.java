package ch.compiler.AST.statement.block;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.jumps.loop.LoopJump;
import ch.compiler.utils.StringUtils;

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

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(depth)).append("FunctionBlock:\n");
        final int deeper = depth + 1;
        if(!statements.isEmpty()) {
            statements.forEach(s -> sb.append(s.toString(deeper)).append("\n"));
        } else {
            sb.append(" ".repeat(deeper)).append("No statement(s)");
        }
        String str = sb.toString();
        return StringUtils.normalizeTrailingNewline(str);
    }

}
