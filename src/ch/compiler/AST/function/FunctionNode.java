package ch.compiler.AST.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.type.Type;
import ch.compiler.AST.statement.block.FunctionBlock;
import ch.compiler.utils.StringUtils;

import java.util.List;

public class FunctionNode extends SubDecNode {

    public FunctionNode(String name, FunctionBlock block, List<ArgVarDecNode> args, Type returntype) {
        super(name, block, args, returntype);
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        final int deepest = depth + 2;
        sb.append(" ".repeat(depth)).append("Function: ").append(name).append(" returns ").append(returntype);
        if(!args.isEmpty()) {
            sb.append("\n").append(" ".repeat(deeper)).append("Parameters:\n");
            args.forEach(arg -> sb.append(arg.toString(deepest)).append("\n"));
        } else {
            sb.append(" has no parameter(s)\n");
        }
        sb.append(block.toString(deeper));
        return sb + "\n";
    }

}
