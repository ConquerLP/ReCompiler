package ch.compiler.AST.misc.symboltable.entry.varEntry;

public class ForVarEntry extends VarEntry {
    public ForVarEntry(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public void resolve() {

    }
}
