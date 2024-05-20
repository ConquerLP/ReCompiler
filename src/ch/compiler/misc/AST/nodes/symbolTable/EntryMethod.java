package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryMethod extends SymbolTableEntry{

	private SymbolTable inputs;
	private Access a;

	public EntryMethod(String name, Type type, Access a) {
		super(name, type);
		this.a = a;
	}

	public void addInput(EntryVariable entry) {
		inputs.add(entry);
	}

}
