package ch.compiler.AST.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.type.SimpleType;
import ch.compiler.AST.misc.Visibility;
import ch.compiler.AST.statement.block.FunctionBlock;

import java.util.List;

public class ConstructorNode extends SubDecNode {

    private Visibility visibility;

    public ConstructorNode(FunctionBlock block, List<ArgVarDecNode> args) {
        super("constructor", block, args);
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void setClassName(String className) {
        this.returntype = new SimpleType(className);
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        final int deepest = depth + 2;
        sb.append(" ".repeat(depth));
        sb.append("Constructor: ").append(name).append(" returns ").append(returntype).append(" is ").append(visibility);
        if(!args.isEmpty()) {
            sb.append("\n").append(" ".repeat(deeper)).append("Parameters:\n");
            args.forEach(arg -> sb.append(arg.toString(deepest)).append("\n"));
        } else {
            sb.append(" has no parameter(s)\n");
        }
        sb.append(block.toString(deeper));
        return sb.toString();
    }

}
