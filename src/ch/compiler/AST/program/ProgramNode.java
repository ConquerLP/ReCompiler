package ch.compiler.AST.program;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.classes.ClassNode;
import ch.compiler.AST.expression.vars.GlobalVarDecNode;
import ch.compiler.AST.function.FunctionNode;
import ch.compiler.AST.statement.jumps.goTo.LabelNode;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {

    private final List<ClassNode> classes = new ArrayList<>();
    private final List<FunctionNode> functions = new ArrayList<>();
    private final List<GlobalVarDecNode> globalVars = new ArrayList<>();
    private final List<LabelNode> labels = new ArrayList<>();
    private MainNode main;

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

    public void addMain(MainNode main) {
        this.main = main;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        classes.forEach(c -> sb.append(c).append("\n"));
        functions.forEach(f -> sb.append(f).append("\n"));
        globalVars.forEach(g -> sb.append(g).append("\n"));
        labels.forEach(l -> sb.append(l).append("\n"));
        sb.append(main);
        return sb.toString();
    }
}
