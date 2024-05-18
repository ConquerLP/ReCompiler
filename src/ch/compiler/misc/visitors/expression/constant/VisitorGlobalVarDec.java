package ch.compiler.misc.visitors.expression.constant;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.nodes.symbolTable.TypeModifier;
import ch.compiler.misc.visitors.VisitorHelper;
import ch.compiler.misc.visitors.expression.type.VisitorComplexType;
import ch.compiler.misc.visitors.expression.type.VisitorTypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;


public class VisitorGlobalVarDec extends ReFuggBaseVisitor<GlobalDeclaration> {

    @Override
    public GlobalDeclaration visitGlobalVar(ReFuggParser.GlobalVarContext ctx) {
        ConstExpNode exp = null;
        Object child = null;
        Type type = null;
        TypeModifier typeModifier = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            child = ctx.getChild(i);
            if (child instanceof ReFuggParser.TypemodifierContext) {
                typeModifier = new VisitorTypeModifier().visitTypemodifier((ReFuggParser.TypemodifierContext) child);
            } else if (child instanceof ReFuggParser.ComplexTypeContext) {
                type = new VisitorComplexType().visitComplexType((ReFuggParser.ComplexTypeContext) child);
            } else if (child instanceof ReFuggParser.ConstExprContext){
                exp = new VisitorConstantExpression().visitConstExpr((ReFuggParser.ConstExprContext) child);
            }
        }
        type.setTypeModifier(typeModifier);
        return new GlobalDeclaration(type, VisitorHelper.getIdentifier(ctx), exp);
    }

}
