package ch.compiler.misc.visitors.expression.type;

import ch.compiler.misc.nodes.declaration.VarDeclaration;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.nodes.symbolTable.TypeModifier;
import ch.compiler.misc.visitors.expression.VisitorExpression;
import ch.compiler.misc.visitors.expression.type.VisitorComplexType;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorVarDec extends ReFuggBaseVisitor<VarDeclaration> {

    @Override
    public VarDeclaration visitVarDec(ReFuggParser.VarDecContext ctx) {
        if(ctx == null) return null;
        Type type = new VisitorComplexType().visitComplexType(ctx.complexType());
        type.setTypeModifier(TypeModifier.NONE);
        if (ctx.orExpression() != null) {
            return new VarDeclaration(type, ctx.identifier().getText(), new VisitorExpression().visitOrExpression(ctx.orExpression()));
        } else {
            return new VarDeclaration(type, ctx.identifier().getText());
        }
    }

}
