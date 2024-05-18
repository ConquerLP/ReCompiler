package ch.compiler.misc.visitors.expression.constant;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.visitors.expression.type.VisitorComplexType;
import ch.compiler.misc.visitors.expression.type.VisitorTypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;


public class VisitorGlobalVarDec extends ReFuggBaseVisitor<GlobalDeclaration> {

    @Override
    public GlobalDeclaration visitGlobalVar(ReFuggParser.GlobalVarContext ctx) {
        Type type = new VisitorComplexType().visitComplexType(ctx.complexType());
        type.setTypeModifier(new VisitorTypeModifier().visitTypemodifier(ctx.typemodifier()));
        ConstExpNode exp = new VisitorConstantExpression().visitConstExpr(ctx.constExpr());
        return new GlobalDeclaration(type, ctx.identifier().getText(), exp);
    }

}
