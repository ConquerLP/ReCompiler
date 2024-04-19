package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.Expression;

public class If extends Statement{
	
	public Expression expression;
	public Block trueBlock;
	public Block falseBlock;
	public If nextIfStatement;
	
}
