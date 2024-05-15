package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class IntegerLiteral extends ConstExpNode {
	
	private final Integer value;

	public IntegerLiteral(Integer value) {
		super(INT);
		this.value = value;
	}

	@Override
	public ConstExpNode evaluate() {
		return this;
	}

	public Integer getValue() {
		return value;
	}

	public int evaluateType() {
		return INT;
	}
}
