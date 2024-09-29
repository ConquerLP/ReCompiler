package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class While extends Statement {

	private ExpressionNode expression;
	private Block block;

	public While(ExpressionNode expression, Block block) {
		this.expression = expression;
		this.block = block;
	}

}
