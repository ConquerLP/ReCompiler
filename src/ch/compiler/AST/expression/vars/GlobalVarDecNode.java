package ch.compiler.AST.expression.vars;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.misc.TypeModifier;
import ch.compiler.AST.misc.type.Type;

public class GlobalVarDecNode extends VarDecNode {

    private final TypeModifier modifier;
    private final c_ExprNode value;

    public GlobalVarDecNode(String name, Type type, TypeModifier modifier, c_ExprNode value) {
        super(name, type);
        this.modifier = modifier;
        this.value = value;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        sb.append(" ".repeat(depth)).append("GlobalVariable").append(position).append(modifier).append(" ").append(super.toString());
        if(value != null) {
            sb.append(value.toString(deeper));
        }
        return sb.toString();
    }

}
