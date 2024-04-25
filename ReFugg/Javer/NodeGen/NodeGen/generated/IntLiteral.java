


public class IntLiteral extends ConstExpNode {
	
	private final Int value;

	public IntLiteral(Int value) {
		this.value = value;
	}

	public ConstExpNode evaluate() {
		return this;
	}

	public Int getValue() {
		return value;
	}

	public int evaluateType() {
		return INT;
	}
}
