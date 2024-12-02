package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.statement.IfNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VIf extends ReFuggBaseVisitor<IfNode> {

    @Override
    public IfNode visitIfStmt(ReFuggParser.IfStmtContext ctx) {
        return new IfNode(new VCheck().visitCheck(ctx.check()),
                new VFunctionBlock().visitFunctionBlock(ctx.functionBlock(0)),
                ctx.functionBlock().size() > 1 ? new VFunctionBlock().visitFunctionBlock(ctx.functionBlock(1)) : null);
    }

}
