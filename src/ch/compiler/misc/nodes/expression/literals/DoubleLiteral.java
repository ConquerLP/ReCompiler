package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class DoubleLiteral extends ConstExpNode {
	
	private final Double value;

	public DoubleLiteral(Double value) {
		super(DOUBLE);
		this.value = value;
	}

	@Override
	public ConstExpNode evaluate() {
		return this;
	}

	public Double getValue() {
		return value;
	}

	public int evaluateType() {
		return DOUBLE;
	}
}
