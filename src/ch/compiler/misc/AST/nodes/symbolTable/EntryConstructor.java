package ch.compiler.misc.AST.nodes.symbolTable;

public class EntryConstructor extends SymbolTableEntry {

    private SymbolTable inputs;
    private Access a;

    public EntryConstructor(String name, Type type, Access a) {
        super(name, type);
        this.a = a;
    }

    public void addInput(EntryVariable entry) {
        inputs.add(entry);
    }

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof EntryConstructor)) return false;
		if(this == obj) return true;
		return name.equals(((EntryConstructor) obj).name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
