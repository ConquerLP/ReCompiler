package ch.compiler.AST.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.misc.type.Type;
import ch.compiler.AST.misc.Visibility;
import ch.compiler.AST.statement.block.FunctionBlock;

import java.util.List;

public class MethodNode extends SubDecNode {

    private Visibility visibility;

    public MethodNode(String name, FunctionBlock block, List<ArgVarDecNode> args, Type returntype) {
        super(name, block, args, returntype);
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

}
