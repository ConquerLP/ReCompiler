package ch.compiler.AST.statement.switchNode;

import ch.compiler.AST.ASTNode;
import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.AST.statement.block.FunctionBlock;

public class CaseNode extends ASTNode {

    private c_ExprNode comparison;
    private boolean isDefault;
    private final FunctionBlock block;

    public CaseNode(c_ExprNode comparison, FunctionBlock block) {
        this.comparison = comparison;
        this.block = block;
        isDefault = true;
    }

    public CaseNode(FunctionBlock block) {
        this.block = block;
        isDefault = true;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        sb.append(" ".repeat(depth));
        if(isDefault) {
            sb.append("Default").append(position).append("\n").append(block.toString(deeper));
        } else {
            sb.append("Case").append(position).append("\n").append(comparison.toString(deeper)).append(block.toString(deeper));
        }
        return sb.toString();
    }

}
