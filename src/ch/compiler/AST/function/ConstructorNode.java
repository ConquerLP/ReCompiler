package ch.compiler.AST.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.Type;
import ch.compiler.AST.misc.Visibility;
import ch.compiler.AST.statement.block.FunctionBlock;

import java.util.List;

public class ConstructorNode extends SubCallNode {

    private final Visibility visibility;

    public ConstructorNode(String name, FunctionBlock block, List<ArgVarDecNode> args, Type returntype, Visibility visibility) {
        super(name, block, args, returntype);
        this.visibility = visibility;
    }

}
