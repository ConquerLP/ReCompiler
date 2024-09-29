package ch.compiler.misc.AST.visitors.expression.type;

import ch.compiler.misc.AST.nodes.declaration.VarDeclaration;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.misc.AST.visitors.expression.VisitorExpression;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorVarDec extends ReFuggBaseVisitor<VarDeclaration> {

    @Override
    public VarDeclaration visitVarDec(ReFuggParser.VarDecContext ctx) {
        Type type = new VisitorType().visitType(ctx.type());
        type.setTypeModifier(new VisitorTypeModifier().visitTypemodifier(ctx.typemodifier()));
        if (ctx.constArray() != null) {
            type.addDim(ctx.constArray().size());
        }
        if (ctx.orExpression() != null) {
            return new VarDeclaration(type, ctx.identifier().getText(), new VisitorExpression().visitOrExpression(ctx.orExpression()));
        } else if (ctx.list() != null) {
            return new VarDeclaration(type, ctx.identifier().getText(), new VisitorExpression().visitList(ctx.list()));
        } else {
            return new VarDeclaration(type, ctx.identifier().getText());
        }
    }

}
