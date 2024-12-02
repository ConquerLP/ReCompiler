package ch.compiler.AST.expression.vars;

import ch.compiler.AST.misc.type.Type;

public class GlobalVarDecNode extends VarDecNode {

    public GlobalVarDecNode(String name, Type type) {
        super(name, type);
    }
}
