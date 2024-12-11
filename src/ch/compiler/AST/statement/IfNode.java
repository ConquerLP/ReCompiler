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
    public String toString() {
        return "";
    }
}
