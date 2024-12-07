package ch.compiler.AST.statement.loop;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.binary.op.OrExprNode;
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
        hasVarDec = first instanceof VarDecNode;
        this.first = first;
        this.second = second;
        this.third = third;
        this.block = block;
    }

}
