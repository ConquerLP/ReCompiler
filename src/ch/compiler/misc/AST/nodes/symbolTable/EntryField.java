package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryField extends SymbolTableEntry {

    private Access a;

	public EntryField(String name, Type type, Access a) {
		super(name, type);
		this.a = a;
	}

}
