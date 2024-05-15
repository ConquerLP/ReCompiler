package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class Jump extends Statement{

	public JumpType jumpType;
	public ExpressionNode expression;
	public String whereToGo;
	
}
