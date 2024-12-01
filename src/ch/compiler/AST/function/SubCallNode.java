package ch.compiler.AST.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.Type;
import ch.compiler.AST.statement.block.FunctionBlock;

import java.util.List;

public abstract class SubCallNode {

    protected final String name;
    protected final FunctionBlock block;
    protected final List<ArgVarDecNode> args;
    protected final Type returntype;

    public SubCallNode(String name, FunctionBlock block, List<ArgVarDecNode> args, Type returntype) {
        this.name = name;
        this.block = block;
        this.args = args;
        this.returntype = returntype;
    }

}
