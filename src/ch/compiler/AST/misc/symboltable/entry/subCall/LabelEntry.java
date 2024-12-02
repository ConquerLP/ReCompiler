package ch.compiler.AST.misc.symboltable.entry.subCall;

public class LabelEntry extends SubCallEntry {
    public LabelEntry(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return null;
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
