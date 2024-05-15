package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class If extends Statement{
	
	public ExpressionNode expression;
	public Block trueBlock;
	public Block falseBlock;
	public If nextIfStatement;
	
}
