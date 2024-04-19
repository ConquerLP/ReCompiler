package ch.compiler.misc.nodes.symbolTable.value;

public class DoubleValue extends Value{

	private double value;
	
	public DoubleValue(char value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}
	
}
