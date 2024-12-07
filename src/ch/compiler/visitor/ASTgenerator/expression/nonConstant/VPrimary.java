package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VPrimary extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitPrimary(ReFuggParser.PrimaryContext ctx) {
        if (ctx.orExpression() != null) {
            return new VBinary().visitOrExpression(ctx.orExpression());
        } else if (ctx.newObject() != null) {
            return new VSubCall().visitNewObject(ctx.newObject());
        } else if (ctx.fCall() != null) {
            return new VSubCall().visitFCall(ctx.fCall());
        } else if (ctx.varAcces() != null) {
            return new VAccess().visitVarAcces(ctx.varAcces());
        } else if (ctx.thisAcces() != null) {
            return new VAccess().visitThisAcces(ctx.thisAcces());
        } else if (ctx.constant() != null) {
            return new VLiterals().visitConstant(ctx.constant());
        } else throw new RuntimeException("Unknown primary expression: " + ctx.getText());
    }

}
