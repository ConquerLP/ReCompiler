package ch.compiler.visitor.ASTgenerator.statement;

import ch.compiler.AST.statement.IfNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VIf extends ReFuggBaseVisitor<IfNode> {

    @Override
    public IfNode visitIfStmt(ReFuggParser.IfStmtContext ctx) {
        if (ctx.ELSE() == null)
            return new IfNode(new VCheck().visitCheck(ctx.check()), new VFunctionBlock().visitFunctionBlock(ctx.functionBlock(0)));
        else
            return new IfNode(new VCheck().visitCheck(ctx.check()),
                    new VFunctionBlock().visitFunctionBlock(ctx.functionBlock(0)),
                    new VFunctionBlock().visitFunctionBlock(ctx.functionBlock(1)));
    }

}
