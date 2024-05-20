package ch.compiler.misc.AST.visitors.expression.constant;

import ch.compiler.misc.AST.nodes.declaration.GlobalDeclaration;
import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.misc.AST.visitors.expression.VisitorExpression;
import ch.compiler.misc.AST.visitors.expression.type.VisitorComplexType;
import ch.compiler.misc.AST.visitors.expression.type.VisitorTypeModifier;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;


public class VisitorGlobalVarDec extends ReFuggBaseVisitor<GlobalDeclaration> {

    @Override
    public GlobalDeclaration visitGlobalVar(ReFuggParser.GlobalVarContext ctx) {
        Type type = new VisitorComplexType().visitComplexType(ctx.complexType());
        type.setTypeModifier(new VisitorTypeModifier().visitTypemodifier(ctx.typemodifier()));
        ExpressionNode exp = new VisitorExpression().visitConstant(ctx.constant());
        return new GlobalDeclaration(type, ctx.identifier().getText(), exp);
    }

}
