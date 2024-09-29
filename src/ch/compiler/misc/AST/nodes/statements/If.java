package ch.compiler.misc.AST.nodes.statements;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class If extends Statement {
	
	private ExpressionNode expression;
	private Statement trueBlock;
	private Statement falseBlock;

	public If(ExpressionNode expression, Statement trueBlock) {
		this.expression = expression;
		this.trueBlock = trueBlock;
	}

	public If(ExpressionNode expression, Statement trueBlock, Statement falseBlock) {
		this.expression = expression;
		this.trueBlock = trueBlock;
		this.falseBlock = falseBlock;
	}

}
