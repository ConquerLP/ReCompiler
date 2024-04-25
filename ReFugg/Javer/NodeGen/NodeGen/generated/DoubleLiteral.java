


public class DoubleLiteral extends ConstExpNode {
	
	private final Double value;

	public DoubleLiteral(Double value) {
		this.value = value;
	}

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
