package ch.compiler.AST.misc.type;

import ch.compiler.AST.expression.constant.c_ExprNode;

import java.util.HashMap;

public class ArrayType extends Type {

    private final Type baseType;
    private final HashMap<Integer, c_ExprNode> expressions = new HashMap<>();
    private final int dim;
    private int counter = 0;

    public ArrayType(String name, int dim) {
        super("array of " + name);
        this.baseType = new SimpleType(name);
        this.dim = dim;
    }

    public void addDim() {
        expressions.put(counter++, null);
    }

    public void addDim(c_ExprNode expr) {
        expressions.put(counter++, expr);
    }

}
