package ch.compiler.AST.statement;

import ch.compiler.AST.statement.block.FunctionBlock;

public class IfNode extends StatementNode {

    private final CheckNode condition;
    private final FunctionBlock ifBlock;
    private final FunctionBlock elseBlock;

    public IfNode(CheckNode condition, FunctionBlock ifBlock, FunctionBlock elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    public IfNode(CheckNode condition, FunctionBlock ifBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = null;
    }

    @Override
    public String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        final int deeper = depth + 1;
        final int deepest = depth + 2;
        sb.append(" ".repeat(depth));
        sb.append("If:\n");
        sb.append(condition.toString(deeper));
        sb.append(ifBlock.toString(deepest));
        if(elseBlock != null) {
            sb.append(" ".repeat(depth));
            sb.append("Else:\n");
            sb.append(elseBlock.toString(deeper));
        }
        return sb.toString();
    }

}
