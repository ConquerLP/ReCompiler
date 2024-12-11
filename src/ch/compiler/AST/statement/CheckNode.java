package ch.compiler.AST.statement;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.expression.nonConstant.ExprNode;

public class CheckNode extends ASTNode {

    private final ExprNode condition;

    public CheckNode(ExprNode condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "";
    }
}
