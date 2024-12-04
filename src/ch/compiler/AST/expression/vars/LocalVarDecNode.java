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


}
