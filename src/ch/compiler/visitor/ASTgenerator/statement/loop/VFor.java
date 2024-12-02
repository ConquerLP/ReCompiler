package ch.compiler.visitor.ASTgenerator.statement.loop;

import ch.compiler.AST.statement.loop.ForNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VFor extends ReFuggBaseVisitor<ForNode> {

    @Override
    public ForNode visitForStmt(ReFuggParser.ForStmtContext ctx) {
        if (ctx.varDec() != null) {

        } else {

        }


        return super.visitForStmt(ctx);
    }
}
