package ch.compiler.misc.nodes.symbolTable;

public class EntryConstructor extends SymbolTableEntry{

	private SymbolTable inputs;
	private Type returnType;
	
	public EntryConstructor(String name) {
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
