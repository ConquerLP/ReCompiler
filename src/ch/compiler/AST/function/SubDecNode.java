package ch.compiler.AST.function;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.type.Type;
import ch.compiler.AST.statement.block.FunctionBlock;

import java.util.List;

public abstract class SubDecNode extends ASTNode {

    protected final String name;
    protected final FunctionBlock block;
    protected final List<ArgVarDecNode> args;
    protected Type returntype;

    public SubDecNode(String name, FunctionBlock block, List<ArgVarDecNode> args, Type returntype) {
        this.name = name;
        this.block = block;
        this.args = args;
        this.returntype = returntype;
    }

    public SubDecNode(String name, FunctionBlock block, List<ArgVarDecNode> args) {
        this.name = name;
        this.block = block;
        this.args = args;
    }

    public void setType(Type type) {
        this.returntype = type;
    }

}
