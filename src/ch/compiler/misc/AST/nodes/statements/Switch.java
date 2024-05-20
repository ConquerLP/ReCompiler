package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

import java.util.List;

public class Switch extends Statement {

    public ExpressionNode expression;
    public List<CaseBlock> caseBlocks;

    public Switch(ExpressionNode expression) {
        this.expression = expression;
    }

    public void addCaseBlock(CaseBlock caseBlock) {
        caseBlocks.add(caseBlock);
    }

}
