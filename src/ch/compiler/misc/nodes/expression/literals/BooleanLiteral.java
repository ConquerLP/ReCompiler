package ch.compiler.misc.nodes.expression.literals;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class BooleanLiteral extends ConstExpNode {
	
	private final Boolean value;

	public BooleanLiteral(Boolean value) {
		super(BOOLEAN);
		this.value = value;
	}

	@Override
	public ConstExpNode evaluate() {
		return this;
	}

	public Boolean getValue() {
		return value;
	}

	public int evaluateType() {
		return BOOLEAN;
	}
}
