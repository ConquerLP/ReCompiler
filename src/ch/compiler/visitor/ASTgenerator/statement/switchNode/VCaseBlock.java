package ch.compiler.visitor.ASTgenerator.statement.switchNode;

import ch.compiler.AST.statement.switchNode.CaseNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.constant.VConstExpr;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VCaseBlock extends ReFuggBaseVisitor<CaseNode> {

    @Override
    public CaseNode visitCaseBlock(ReFuggParser.CaseBlockContext ctx) {
        if(ctx.constExpr() != null){
            return new CaseNode(new VConstExpr().visitConstExpr(ctx.constExpr()),
                    new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()));
        } else {
            return new CaseNode(new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()));
        }
    }

}
