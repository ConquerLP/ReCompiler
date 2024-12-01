package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.expression.vars.ArgVarDecNode;
import ch.compiler.AST.expression.vars.VarDecNode;
import ch.compiler.AST.misc.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.constant.VConstExpr;

public class VArg extends ReFuggBaseVisitor<VarDecNode> {

    @Override
    public ArgVarDecNode visitArg(ReFuggParser.ArgContext ctx) {
        Type type = new Type(ctx.type().getText());
        ArgVarDecNode varDecNode = new ArgVarDecNode(ctx.type().getText(), type);
        VConstExpr vConstExpr = new VConstExpr();
        ctx.constArray().forEach(array -> varDecNode.addArray(vConstExpr.visitConstExpr(array.constExpr())));
        return varDecNode;
    }

}
