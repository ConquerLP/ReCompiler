package ch.compiler.AST.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.Type;
import ch.compiler.AST.statement.block.FunctionBlock;

import java.util.List;

public class FunctionNode extends SubCallNode {

    public FunctionNode(String name, FunctionBlock block, List<ArgVarDecNode> args, Type returntype) {
        super(name, block, args, returntype);
    }
}
