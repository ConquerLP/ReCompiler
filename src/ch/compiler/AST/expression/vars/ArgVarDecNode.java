package ch.compiler.AST.expression.vars;

import ch.compiler.AST.misc.type.Type;

public class ArgVarDecNode extends VarDecNode {

    public ArgVarDecNode(String name, Type type) {
        super(name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type).append(" ").append(name);
        return sb.toString();
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(depth)).append("Argument: ").append(super.toString());
        return sb.toString();
    }

}
