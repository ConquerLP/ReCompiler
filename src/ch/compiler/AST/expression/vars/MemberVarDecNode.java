package ch.compiler.AST.expression.vars;

import ch.compiler.AST.misc.Type;
import ch.compiler.AST.misc.Visibility;

public class MemberVarDecNode extends VarDecNode {

    private final Visibility visibility;

    public MemberVarDecNode(String name, Type type, Visibility visibility) {
        super(name, type);
        this.visibility = visibility;
    }
}
