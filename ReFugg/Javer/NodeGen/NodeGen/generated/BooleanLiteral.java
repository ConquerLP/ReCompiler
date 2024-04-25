


public class BooleanLiteral extends ConstExpNode {
	
	private final Boolean value;

	public BooleanLiteral(Boolean value) {
		this.value = value;
	}

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
