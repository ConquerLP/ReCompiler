package ch.compiler.AST.program;

import ch.compiler.AST.classes.ClassNode;
import ch.compiler.AST.expression.vars.GlobalVarDecNode;
import ch.compiler.AST.function.FunctionNode;
import ch.compiler.AST.statement.jumps.LabelNode;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode {

    private final List<ClassNode> classes = new ArrayList<>();
    private final List<FunctionNode> functions = new ArrayList<>();
    private final List<GlobalVarDecNode> globalVars = new ArrayList<>();
    private final List<LabelNode> labels = new ArrayList<>();

    public void addClass(ClassNode classNode) {
        classes.add(classNode);
    }

    public void addFunction(FunctionNode functionNode) {
        functions.add(functionNode);
    }

    public void addGlobalVar(GlobalVarDecNode globalVarNode) {
        globalVars.add(globalVarNode);
    }

    public void addLabel(LabelNode labelNode) {
        labels.add(labelNode);
    }

}
