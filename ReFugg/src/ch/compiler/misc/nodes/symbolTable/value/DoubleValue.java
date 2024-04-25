package ch.compiler.misc.nodes.symbolTable.value;

public class DoubleValue extends Value<Double>{

	private double value;
	
	public DoubleValue(double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	@Override
	public String getType() {
		return "double";
	}
}
