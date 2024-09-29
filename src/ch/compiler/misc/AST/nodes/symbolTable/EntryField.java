package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryField extends SymbolTableEntry {

    private Access a;

	public EntryField(String name, Type type, Access a) {
		super(name, type);
		this.a = a;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof EntryField)) return false;
		if(this == obj) return true;
		return name.equals(((EntryField) obj).name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
