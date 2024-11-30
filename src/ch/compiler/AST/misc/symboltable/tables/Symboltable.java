package ch.compiler.AST.misc.symboltable.tables;

import ch.compiler.AST.misc.symboltable.entry.SymboltableEntry;

public abstract class Symboltable {

    protected final Symboltable parent;

    public Symboltable(Symboltable parent) {
        this.parent = parent;
    }

    public Symboltable getParent() {
        return parent;
    }

    public abstract void add(SymboltableEntry entry);

    public abstract SymboltableEntry lookup(String name);

}
