package ch.compiler.AST.program;

import ch.compiler.AST.classes.ClassNode;
import ch.compiler.AST.expression.vars.GlobalVarDecNode;
import ch.compiler.AST.function.FunctionNode;
import ch.compiler.AST.misc.symboltable.tables.ProgramSymboltable;
import ch.compiler.AST.statement.jumps.LabelNode;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode {

    private final ProgramSymboltable symboltable = new ProgramSymboltable();
    private final List<ClassNode> classes = new ArrayList<>();
    private final List<FunctionNode> functions = new ArrayList<>();
    private final List<GlobalVarDecNode> globalVars = new ArrayList<>();
    private final List<LabelNode> labels = new ArrayList<>();

    public ProgramSymboltable getSymboltable() {
        return symboltable;
    }

    public void addClass(ClassNode classNode) {
        symboltable.add(classNode.toEntry());
        classes.add(classNode);
    }

    public void addFunction(FunctionNode functionNode) {
        symboltable.add(functionNode.toEntry());
        functions.add(functionNode);
    }

    public void addGlobalVar(GlobalVarDecNode globalVarNode) {
        symboltable.add(globalVarNode.toEntry());
        globalVars.add(globalVarNode);
    }

    public void addLabel(LabelNode labelNode) {
        symboltable.add(labelNode.toEntry());
        labels.add(labelNode);
    }

}
