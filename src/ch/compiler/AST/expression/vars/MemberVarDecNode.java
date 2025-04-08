package ch.compiler.AST.expression.vars;

import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.misc.TypeModifier;
import ch.compiler.AST.misc.Visibility;
import ch.compiler.AST.misc.type.Type;

public class MemberVarDecNode extends VarDecNode {

    private Visibility visibility;
    private final TypeModifier typeModifier;
    private c_ExprNode initExpr;

    public MemberVarDecNode(String name, Type type, TypeModifier typeModifier) {
        super(name, type);
        this.typeModifier = typeModifier;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void setExpr(c_ExprNode exp) {
        this.initExpr = exp;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        sb.append(" ".repeat(depth)).append("Member in class: ");
        sb.append(typeModifier).append(" ").append(visibility).append(" ").append(super.toString());
        if(initExpr != null) {
            sb.append(initExpr.toString(deeper));
        }
        return sb.toString();
    }

}
