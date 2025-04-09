package ch.compiler.AST.statement.switchNode;

import ch.compiler.AST.statement.CheckNode;
import ch.compiler.AST.statement.StatementNode;

import java.util.ArrayList;
import java.util.List;

public class SwitchNode extends StatementNode {

    private final CheckNode check;
    private final List<CaseNode> cases = new ArrayList<>();

    public SwitchNode(CheckNode check) {
        this.check = check;
    }

    public void addCase(CaseNode caseNode) {
        cases.add(caseNode);
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        sb.append(" ".repeat(depth)).append("Switch").append(position).append("\n").append(check.toString(deeper));
        cases.forEach(c -> sb.append(c.toString(deeper)));
        return sb.toString();
    }

}
