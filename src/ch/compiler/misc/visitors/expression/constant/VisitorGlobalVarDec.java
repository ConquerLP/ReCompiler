package ch.compiler.misc.visitors.expression.constant;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorGlobalVarDec extends ReFuggBaseVisitor<GlobalDeclaration> {

    @Override
    public GlobalDeclaration visitGlobalNoInit(ReFuggParser.GlobalNoInitContext ctx) {
        String name = null;
        for(int i = 0; i < ctx.getChildCount(); i++){
            Object o = ctx.getChild(i);
            if(o instanceof ReFuggParser.IdentifierContext){
                name = ((ReFuggParser.IdentifierContext) o).getText();
                break;
            }
        }

        return new GlobalDeclaration(new Type(ctx), null);
    }

    @Override
    public GlobalDeclaration visitGlobalYesInit(ReFuggParser.GlobalYesInitContext ctx) {
        ConstExpNode exp = null;
        for(int i = 0; i < ctx.getChildCount(); i++){
            Object o = ctx.getChild(i);
            if(o instanceof ReFuggParser.ConstExprContext){
                exp = new VisitorConstantExpression().visitConstExpr((ReFuggParser.ConstExprContext) o);
                break;
            }
        }
        return new GlobalDeclaration(new Type(ctx), null, exp);
    }
}