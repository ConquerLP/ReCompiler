package ch.compiler.misc.nodes.symbolTable;

public class EntryMethod extends SymbolTableEntry{

	private SymbolTable inputs;
	private Type returnType;
	private Access a;
	
	public EntryMethod(String name) {
		super(name);
	}
	
	public void setReturnType(Type type) {
		this.returnType = type;
	}
	
	public void addInput(EntryVariable entry) {
		inputs.add(entry);
	}
	
	public SymbolTable getInputs() {
		return inputs;
	}
	
	public Type getReturnType() {
		return returnType;
	}
	
}
