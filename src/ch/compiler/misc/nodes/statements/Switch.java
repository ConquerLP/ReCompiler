package ch.compiler.misc.nodes.statements;

import java.util.List;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class Switch extends Statement{
	
	public ExpressionNode expression;
	public List<CaseBlock> caseBlocks;
	
}
