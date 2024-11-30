package ch.compiler.AST.program;

import ch.compiler.AST.misc.symboltable.tables.Symboltable;
import ch.compiler.AST.statement.block.FunctionBlock;

public class MainNode {

    private FunctionBlock mainBlock;
    private Symboltable programSymbols;

    public MainNode(Symboltable programSymbols) {
        this.programSymbols = programSymbols;
    }

}
