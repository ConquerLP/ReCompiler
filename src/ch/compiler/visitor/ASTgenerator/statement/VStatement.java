package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VStatement extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public StatementNode visitStmt(ReFuggParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }
}
