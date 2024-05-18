package ch.compiler.misc.nodes.statements;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public class DoWhile extends Statement{
	
	private ExpressionNode expression;
	private Block block;
	
	public DoWhile(ExpressionNode expression, Block block) {
		this.expression = expression;
		this.block = block;
	}

}
