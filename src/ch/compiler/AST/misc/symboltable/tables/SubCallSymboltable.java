package ch.compiler.AST.misc.symboltable.tables;

import ch.compiler.AST.misc.symboltable.entry.SymboltableEntry;

public class SubCallSymboltable extends Symboltable {

    public SubCallSymboltable(Symboltable parent) {
        super(parent);
    }

    @Override
    public void add(SymboltableEntry entry) {

    }

    @Override
    public SymboltableEntry lookup(String name) {
        return null;
    }



}
