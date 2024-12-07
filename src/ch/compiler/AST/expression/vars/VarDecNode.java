package ch.compiler.AST.expression.vars;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.misc.type.Type;
import ch.compiler.AST.statement.StatementNode;

import java.util.ArrayList;
import java.util.List;

public abstract class VarDecNode extends StatementNode {

    protected final String name;
    protected final Type type;
    protected final List<c_ExprNode> array = new ArrayList<>();

    public VarDecNode(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public void addArray(c_ExprNode expr) {
        array.add(expr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" Type: ").append(type);
        return sb.toString();
    }
}
