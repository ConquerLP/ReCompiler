package ch.compiler.misc.AST.visitors.expression.constant;

import ch.compiler.misc.AST.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.AST.nodes.declaration.VarDeclaration;
import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.misc.AST.visitors.expression.VisitorExpression;
import ch.compiler.misc.AST.visitors.expression.type.VisitorType;
import ch.compiler.misc.AST.visitors.expression.type.VisitorTypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;


public class VisitorGlobalVarDec extends ReFuggBaseVisitor<GlobalDeclaration> {

    @Override
    public GlobalDeclaration visitGlobalVar(ReFuggParser.GlobalVarContext ctx) {
        Type type = new VisitorType().visitType(ctx.type());
        type.setTypeModifier(new VisitorTypeModifier().visitTypemodifier(ctx.typemodifier()));
        if (ctx.constArray() != null) {
            type.addDim(ctx.constArray().size());
        }
        if (ctx.constExpr() != null) {
            return new GlobalDeclaration(type, ctx.identifier().getText(), new VisitorExpression().visitConstExpr(ctx.constExpr()));
        } else if (ctx.constList() != null) {
            return new GlobalDeclaration(type, ctx.identifier().getText(), new VisitorExpression().visitConstList(ctx.constList()));
        } else {
            return null;
        }
    }

}
