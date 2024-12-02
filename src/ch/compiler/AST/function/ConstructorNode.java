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

}
