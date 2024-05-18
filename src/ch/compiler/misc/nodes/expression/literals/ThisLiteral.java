package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class ThisLiteral extends PointerLiteral {

	private int value;

	public ThisLiteral() {
		super(NULL);
	}

	@Override
	public ConstExpNode evaluate() {
		return this;
	}

	public int getValue() {
		return value;
	}

	public int evaluateType() {
		return THIS;
	}
}
