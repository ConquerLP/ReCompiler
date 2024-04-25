package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.Expression;

public class Jump extends Statement{

	public JumpType jumpType;
	public Expression expression;
	public String whereToGo;
	
}
