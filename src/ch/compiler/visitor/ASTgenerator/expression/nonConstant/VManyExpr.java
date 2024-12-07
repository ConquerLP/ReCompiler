package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.access.MemberExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VManyExpr extends ReFuggBaseVisitor<List<ExprNode>> {

    @Override
    public List<ExprNode> visitExprTail(ReFuggParser.ExprTailContext ctx) {
        List<ExprNode> exprNodes = new ArrayList<>();
        if (ctx.identifier() != null) {
            exprNodes.add(new MemberExprNode(ctx.identifier().getText()));
        } else if (ctx.methodCall() != null) {
            exprNodes.add(new VSubCall().visitMethodCall(ctx.methodCall()));
        }
        if (ctx.arrayAccess() != null) {
            ctx.arrayAccess().forEach(arrayAccessContext -> {
                exprNodes.add(new VAccess().visitArrayAccess(arrayAccessContext));
            });
        }
        return exprNodes;
    }

    @Override
    public List<ExprNode> visitFArgs(ReFuggParser.FArgsContext ctx) {
        List<ExprNode> exprNodes = new ArrayList<>();
        if (ctx.expressionMany() != null) {
            ctx.expressionMany().orExpression().forEach(orExpressionContext -> {
                exprNodes.add(new VBinary().visitOrExpression(orExpressionContext));
            });
        }
        return exprNodes;
    }

    @Override
    public List<ExprNode> visitExpressionMany(ReFuggParser.ExpressionManyContext ctx) {
        List<ExprNode> exprNodes = new ArrayList<>();
        if (ctx.orExpression() != null) {
            ctx.orExpression().forEach(orExpressionContext -> {
                exprNodes.add(new VBinary().visitOrExpression(orExpressionContext));
            });
        }
        return exprNodes;
    }

}
