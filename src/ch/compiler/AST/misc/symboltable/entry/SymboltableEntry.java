package ch.compiler.AST.misc.symboltable.entry;

public abstract class SymboltableEntry {

    protected final String name;
    protected boolean resolved = false;

    public SymboltableEntry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract void resolve();

    public boolean isResolved() {
        return resolved;
    }
}
