package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.binary.BinaryExprNode;
import ch.compiler.AST.expression.nonConstant.binary.op.OrExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VBinary extends ReFuggBaseVisitor<BinaryExprNode> {

    @Override
    public OrExprNode visitOrExpression(ReFuggParser.OrExpressionContext ctx) {



        return new OrExprNode();
    }

    @Override
    public BinaryExprNode visitAndExpression(ReFuggParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }

    @Override
    public BinaryExprNode visitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx) {
        return super.visitEqualityExpression(ctx);
    }

    @Override
    public BinaryExprNode visitRelationalExpression(ReFuggParser.RelationalExpressionContext ctx) {
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public BinaryExprNode visitAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx) {
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public BinaryExprNode visitMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx) {
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public BinaryExprNode visitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx) {
        return super.visitExponentiationExpression(ctx);
    }
}
