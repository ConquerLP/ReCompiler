package ch.compiler.misc.nodes.symbolTable;

public class EntryClass extends SymbolTableEntry{

	private SymbolTable methods;
	private SymbolTable constructors;
	private SymbolTable fields;
	
	public EntryClass(String name) {
		super(name);
	}
	
	public void addConstructor(EntryConstructor entry) {
		constructors.add(entry);
	}
	
	public void addMethod(EntryMethod entry) {
		methods.add(entry);
	}
	
	public void addField(EntryField entry) {
		fields.add(entry);
	}
	
	public SymbolTable getMethods() {
		return methods;
	}
	
	public SymbolTable getConstructors() {
		return constructors;
	}
	
	public SymbolTable getFields() {
		return fields;
	}
}
