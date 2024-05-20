package ch.compiler.misc.AST.nodes.symbolTable;

import java.util.HashMap;

public class SymbolTable {

    private HashMap<String, SymbolTableEntry> entries = new HashMap<>();

    public void add(SymbolTableEntry entry) throws RuntimeException {
        if (entries.get(entry.getName()) != null) {
            throw new RuntimeException("Symbol already defined: " + entry.getName());
        }
        entries.put(entry.getName(), entry);
    }

}
