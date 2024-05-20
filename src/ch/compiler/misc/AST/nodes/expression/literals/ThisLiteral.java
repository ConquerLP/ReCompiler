package ch.compiler.misc.AST.nodes.expression.literals;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;

public class ThisLiteral extends PointerLiteral {

	public ThisLiteral() {
		super(ExpressionNode.THIS);
	}

	@Override
	public ExpressionNode evaluate() {
		return this;
	}

	public int evaluateType() {
		return THIS;
	}

}
