package ch.compiler.AST.misc.symboltable.tables;

import ch.compiler.AST.misc.symboltable.entry.ClassEntry;
import ch.compiler.AST.misc.symboltable.entry.SymboltableEntry;
import ch.compiler.AST.misc.symboltable.entry.subCall.FunctionEntry;
import ch.compiler.AST.misc.symboltable.entry.subCall.LabelEntry;
import ch.compiler.AST.misc.symboltable.entry.varEntry.GlobalVarEntry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProgramSymboltable extends Symboltable {

    private final Map<String, ClassEntry> classes = new HashMap<>();
    private final Map<String, FunctionEntry> functions = new HashMap<>();
    private final Map<String, GlobalVarEntry> globalVars = new HashMap<>();
    private final Map<String, LabelEntry> labels = new HashMap<>();
    private final Set<String> usedNames = new HashSet<>();

    public ProgramSymboltable() {
        super(null);
    }

    @Override
    public void add(SymboltableEntry entry) {
        if(!usedNames.add(entry.getName())) {
            throw new RuntimeException("Name already used: " + entry.getName());
        }
        if (entry instanceof ClassEntry) {
            classes.put(entry.getName(), (ClassEntry) entry);
        } else if (entry instanceof FunctionEntry) {
            functions.put(entry.getName(), (FunctionEntry) entry);
        } else if (entry instanceof GlobalVarEntry) {
            globalVars.put(entry.getName(), (GlobalVarEntry) entry);
        } else if (entry instanceof LabelEntry) {
            labels.put(entry.getName(), (LabelEntry) entry);
        }
    }

    @Override
    public SymboltableEntry lookup(String name) {
        if (classes.containsKey(name)) {
            return classes.get(name);
        } else if (functions.containsKey(name)) {
            return functions.get(name);
        } else if (globalVars.containsKey(name)) {
            return globalVars.get(name);
        } else if (labels.containsKey(name)) {
            return labels.get(name);
        } else {
            return null;
        }
    }

}
