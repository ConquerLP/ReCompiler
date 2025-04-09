package ch.compiler.AST.statement.loop;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.vars.VarDecNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.block.LoopBlock;

public class ForNode extends StatementNode {

    private final boolean hasVarDec;
    private final StatementNode first;
    private final ExprNode second;
    private final ExprNode third;
    private final LoopBlock block;

    public ForNode(StatementNode first, ExprNode second, ExprNode third, LoopBlock block) {
        if(first == null) {
            hasVarDec = false;
        } else {
            hasVarDec = first instanceof VarDecNode;
        }
        this.first = first;
        this.second = second;
        this.third = third;
        this.block = block;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        final int deepest = depth + 2;
        sb.append("For").append(position).append("\n");
        String firstType = hasVarDec ? "VarDeclaration" : "Statement" + " (first):\n";
        sb.append(" ".repeat(deeper)).append(firstType);
        if(first != null) {
            sb.append(first.toString(deepest));
        } else {
            sb.append(" ".repeat(deepest)).append("None\n");
        }
        sb.append(" ".repeat(deeper)).append("Expression (second):\n");
        if(second != null) {
            sb.append(second.toString(deepest));
        } else {
            sb.append(" ".repeat(deepest)).append("None\n");
        }
        sb.append(" ".repeat(deeper)).append("Expression (third):\n");
        if(third != null) {
            sb.append(third.toString(deepest));
        } else {
            sb.append(" ".repeat(deepest)).append("None\n");
        }
        sb.append(block.toString(deeper));
        return sb.toString();
    }

}
