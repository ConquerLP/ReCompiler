package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.access.ArrayExprNode;
import ch.compiler.AST.expression.nonConstant.access.ThisExprNode;
import ch.compiler.AST.expression.nonConstant.access.VarExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VAccess extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitArrayAccess(ReFuggParser.ArrayAccessContext ctx) {
        ArrayExprNode arrayExprNode = new ArrayExprNode();
        arrayExprNode.addExpression(new VExpr().visitExpression(ctx.expression()));
        return arrayExprNode;
    }

    @Override
    public ExprNode visitThisAcces(ReFuggParser.ThisAccesContext ctx) {
        ThisExprNode thisExprNode = new ThisExprNode();
        ctx.exprTail().forEach(exprTailContext -> {
            new VManyExpr().visitExprTail(exprTailContext).forEach(thisExprNode::addExpression);
        });
        return thisExprNode;
    }

    @Override
    public ExprNode visitVarAcces(ReFuggParser.VarAccesContext ctx) {
        VarExprNode varExprNode = new VarExprNode(ctx.identifier().getText());
        if(ctx.arrayAccess() != null) {
            ctx.arrayAccess().forEach(arrayAccessContext -> {
                varExprNode.addExpression(new VAccess().visitArrayAccess(arrayAccessContext));
            });
        }
        if(ctx.exprTail() != null) {
            ctx.exprTail().forEach(exprTailContext -> {
                new VManyExpr().visitExprTail(exprTailContext).forEach(varExprNode::addExpression);
            });
        }
        return varExprNode;
    }

}
