package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VLHExpr extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitLh_expression(ReFuggParser.Lh_expressionContext ctx) {
        if(ctx.thisAcces() != null) {
            return new VAccess().visitThisAcces(ctx.thisAcces());
        } else if(ctx.varAcces() != null) {
            return new VAccess().visitVarAcces(ctx.varAcces());
        } else {
            throw new RuntimeException("Unknown left hand expression: " + ctx.getText());
        }
    }
}
