package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryConstructor extends SymbolTableEntry{

	private SymbolTable inputs;
	private Access a;

	public EntryConstructor(String name, Type type, Access a) {
		super(name, type);
		this.a = a;
	}

	public void addInput(EntryVariable entry) {
		inputs.add(entry);
	}

}
