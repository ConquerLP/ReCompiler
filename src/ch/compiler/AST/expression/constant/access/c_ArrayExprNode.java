package ch.compiler.AST.expression.constant.access;

import ch.compiler.AST.expression.constant.c_ExprNode;

import java.util.ArrayList;
import java.util.List;

public class c_ArrayExprNode extends c_AccessExprNode {

    private final String name;
    private final List<c_ExprNode> array = new ArrayList<>();

    public c_ArrayExprNode(String name) {
        this.name = name;
    }

    public void add(c_ExprNode expr) {
        array.add(expr);
    }

}
