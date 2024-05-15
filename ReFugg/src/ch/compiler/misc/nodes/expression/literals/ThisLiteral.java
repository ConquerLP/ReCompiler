package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class ThisLiteral extends PointerLiteral {

	private final int value;

	public ThisLiteral(int value) {
		super(NULL);
		this.value = value;
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
