package ch.compiler.visitor.ASTgenerator.statement.block;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.VStatement;
import ch.compiler.visitor.ASTgenerator.statement.jumps.VFunctionJump;
import ch.compiler.visitor.ASTgenerator.statement.jumps.VLoopJump;

public class VBlockPart extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitLoopBlockStmt(ReFuggParser.LoopBlockStmtContext ctx) {
        StatementNode stmt;
        if(ctx.stmt() != null) {
            stmt = new VStatement().visitStmt(ctx.stmt());
        } else {
            stmt = new VLoopJump().visitLoopJumpStmt(ctx.loopJumpStmt());
        }
        return stmt;
    }

    @Override
    public StatementNode visitFunctionBlockStmt(ReFuggParser.FunctionBlockStmtContext ctx) {
        StatementNode stmt;
        if(ctx.stmt() != null) {
            stmt = new VStatement().visitStmt(ctx.stmt());
        } else {
            stmt = new VFunctionJump().visitFunctionJumpStmt(ctx.functionJumpStmt());
        }
        return stmt;
    }

}
