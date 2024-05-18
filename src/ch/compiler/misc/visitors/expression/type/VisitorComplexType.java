package ch.compiler.misc.visitors.expression.type;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.misc.visitors.expression.constant.VisitorConstantExpression;

public class VisitorComplexType extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitType(ReFuggParser.TypeContext ctx) {
        String typeString = ctx.getText();
        if(ctx.getChild(0) instanceof ReFuggParser.IdentifierContext){
            typeString = ctx.getChild(0).getText();
        }
        Type type = new Type(typeString);
        return type;
    }

    @Override
    public Type visitComplexType(ReFuggParser.ComplexTypeContext ctx) {
        Type type = visitType(ctx.type());
        if(ctx.getChildCount() > 1){
            for(int i = 1; i < ctx.getChildCount(); i++){
                if(ctx.getChild(i) instanceof ReFuggParser.ConstArrayContext){
                    ConstExpNode node = new VisitorConstantExpression().visitConstArray((ReFuggParser.ConstArrayContext) ctx.getChild(i));
                    type.addDim(((IntegerLiteral) node).getValue());
                }
            }
        }
        return type;
    }
}
