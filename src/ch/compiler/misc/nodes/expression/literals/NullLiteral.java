package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class NullLiteral extends PointerLiteral {

	private final int value = 0;

	public NullLiteral() {
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
		return NULL;
	}
}
