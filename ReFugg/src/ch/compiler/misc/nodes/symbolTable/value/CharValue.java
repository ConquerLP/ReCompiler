package ch.compiler.misc.nodes.symbolTable.value;

public class CharValue extends Value{

	private char value;
	
	public CharValue(char value) {
		this.value = value;
	}
	
	public Boolean getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType() {
		return "char";
	}

}
