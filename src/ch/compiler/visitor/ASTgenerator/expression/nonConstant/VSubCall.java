package ch.compiler.visitor.ASTgenerator.expression.nonConstant;

import ch.compiler.AST.expression.nonConstant.ExprNode;
import ch.compiler.AST.expression.nonConstant.subCall.MethodExprNode;
import ch.compiler.AST.expression.nonConstant.subCall.NewObjExprNode;
import ch.compiler.AST.expression.nonConstant.subCall.fCallExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.List;

public class VSubCall extends ReFuggBaseVisitor<ExprNode> {

    @Override
    public ExprNode visitNewObject(ReFuggParser.NewObjectContext ctx) {
        List<ExprNode> exprNodes = new VManyExpr().visitFArgs(ctx.fArgs());
        NewObjExprNode obj = new NewObjExprNode(ctx.identifier().getText());
        obj.addArgs(new VManyExpr().visitFArgs(ctx.fArgs()));
        if(ctx.arrayAccess() != null) {
            ctx.arrayAccess().forEach(arrayAccessContext -> {
                obj.addArrayAccess(new VAccess().visitArrayAccess(arrayAccessContext));
            });
        }
        if(ctx.exprTail() != null) {
            ctx.exprTail().forEach(exprTailContext -> {
                obj.addExprTails(new VManyExpr().visitExprTail(exprTailContext));
            });
        }
        return obj;
    }

    @Override
    public ExprNode visitFCall(ReFuggParser.FCallContext ctx) {
        fCallExprNode fCall = new fCallExprNode(ctx.identifier().getText());
        fCall.addArgs(new VManyExpr().visitFArgs(ctx.fArgs()));
        if(ctx.arrayAccess() != null) {
            ctx.arrayAccess().forEach(arrayAccessContext -> {
                fCall.addArrayAccess(new VAccess().visitArrayAccess(arrayAccessContext));
            });
        }
        if(ctx.exprTail() != null) {
            ctx.exprTail().forEach(exprTailContext -> {
                fCall.addExprTails(new VManyExpr().visitExprTail(exprTailContext));
            });
        }
        return fCall;
    }

    @Override
    public ExprNode visitMethodCall(ReFuggParser.MethodCallContext ctx) {
        MethodExprNode method = new MethodExprNode(ctx.identifier().getText());
        method.addArgs(new VManyExpr().visitFArgs(ctx.fArgs()));
        if(ctx.arrayAccess() != null) {
            ctx.arrayAccess().forEach(arrayAccessContext -> {
                method.addArrayAccess(new VAccess().visitArrayAccess(arrayAccessContext));
            });
        }
        if(ctx.exprTail() != null) {
            ctx.exprTail().forEach(exprTailContext -> {
                method.addExprTails(new VManyExpr().visitExprTail(exprTailContext));
            });
        }
        return method;
    }

}
