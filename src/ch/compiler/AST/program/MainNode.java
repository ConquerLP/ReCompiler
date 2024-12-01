package ch.compiler.AST.program;

import ch.compiler.AST.statement.block.FunctionBlock;

public class MainNode {

    private final FunctionBlock mainBlock;

    public MainNode(FunctionBlock mainBlock) {
        this.mainBlock = mainBlock;
    }

    public FunctionBlock getMainBlock() {
        return mainBlock;
    }

}
