package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VSubCall extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitNewObject(ReFuggParser.NewObjectContext ctx) {
        return super.visitNewObject(ctx);
    }

    @Override
    public ExprNode visitFCall(ReFuggParser.FCallContext ctx) {
        return super.visitFCall(ctx);
    }

    @Override
    public ExprNode visitMethodCall(ReFuggParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }
}
