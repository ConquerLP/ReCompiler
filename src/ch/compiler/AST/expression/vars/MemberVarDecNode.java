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

}
