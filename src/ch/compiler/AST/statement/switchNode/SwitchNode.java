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

}
