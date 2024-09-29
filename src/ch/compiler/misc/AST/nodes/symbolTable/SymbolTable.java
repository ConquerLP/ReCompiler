package ch.compiler.misc.AST.nodes.symbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {

    private HashMap<String, SymbolTableEntry> entries = new HashMap<>();

    public void add(SymbolTableEntry entry) throws RuntimeException {
        if (inList(entry)) {
            throw new RuntimeException("Symbol already defined: " + entry.getName());
        }
        entries.put(entry.getName(), entry);
    }

    public void add(SymbolTable table) {
        table.getEntries().forEach(this::add);
    }

    public List<SymbolTableEntry> getEntries() {
        return new ArrayList<>(entries.values());
    }

    public boolean inList(SymbolTableEntry entry) {
        return entries.containsValue(entry);
    }

    public List<EntryVariable> getVars() {
        return entries.values().stream()
                .filter(e -> e instanceof EntryVariable)
                .map(e -> (EntryVariable) e)
                .toList();
    }

    public List<EntryLabel> getLabels() {
        return entries.values().stream()
                .filter(e -> e instanceof EntryLabel)
                .map(e -> (EntryLabel) e)
                .toList();
    }

    public List<EntryClass> getClasses() {
        return entries.values().stream()
                .filter(e -> e instanceof EntryClass)
                .map(e -> (EntryClass) e)
                .toList();
    }

    public List<EntryFunction> getFunctions() {
        return entries.values().stream()
                .filter(e -> e instanceof EntryFunction)
                .map(e -> (EntryFunction) e)
                .toList();
    }

}
