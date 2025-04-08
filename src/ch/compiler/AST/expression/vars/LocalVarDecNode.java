package ch.compiler.AST.expression.vars;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.misc.TypeModifier;
import ch.compiler.AST.misc.type.Type;

public class LocalVarDecNode extends VarDecNode {

    private final TypeModifier modifier;
    private ExprNode value;

    public LocalVarDecNode(String name, Type type, TypeModifier modifier) {
        super(name, type);
        this.modifier = modifier;
    }

    public LocalVarDecNode(String name, Type type, TypeModifier modifier, ExprNode value) {
        super(name, type);
        this.modifier = modifier;
        this.value = value;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        sb.append(" ".repeat(depth)).append("LocalVariable: ").append(modifier).append(" ").append(super.toString());
        if(value != null) {
            sb.append(value.toString(deeper));
        }
        return sb.toString();
    }

}
