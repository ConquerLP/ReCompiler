package ch.compiler.AST.statement.loop;

import ch.compiler.AST.expression.nonConstant.binary.op.OrExprNode;
import ch.compiler.AST.expression.vars.VarDecNode;
import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.block.LoopBlock;

public class ForNode extends StatementNode {

    private final boolean hasVarDec;
    private VarDecNode varDec;
    private OrExprNode first;
    private final OrExprNode second;
    private final OrExprNode third;
    private final LoopBlock block;

    public ForNode(OrExprNode first, OrExprNode second, OrExprNode third, LoopBlock block) {
        this.hasVarDec = false;
        this.first = first;
        this.second = second;
        this.third = third;
        this.block = block;
    }

    public ForNode(VarDecNode varDec, OrExprNode second, OrExprNode third, LoopBlock block) {
        this.hasVarDec = true;
        this.varDec = varDec;
        this.second = second;
        this.third = third;
        this.block = block;
    }

}
