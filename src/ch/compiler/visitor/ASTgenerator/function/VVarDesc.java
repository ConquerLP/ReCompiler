package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.misc.type.ArrayType;
import ch.compiler.AST.misc.type.SimpleType;
import ch.compiler.AST.misc.type.Type;
import ch.compiler.AST.misc.type.VoidType;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.constant.VConstExpr;

public class VVarDesc extends ReFuggBaseVisitor<Type> {

    @Override
    public Type visitVarDescription(ReFuggParser.VarDescriptionContext ctx) {
        Type type;
        String typeName;
        if (ctx.type().identifier() != null) {
            typeName = ctx.type().identifier().getText();
        } else {
            typeName = ctx.type().getText();
        }
        if (!ctx.constArray().isEmpty()) {
            type = new ArrayType(typeName, ctx.constArray().size());
            ctx.constArray().forEach(
                    array -> ((ArrayType) type).addDim(new VConstExpr().visitConstArray(array)));
        } else {
            type = new SimpleType(typeName);
        }
        return type;
    }

    @Override
    public Type visitFHeader(ReFuggParser.FHeaderContext ctx) {
        Type type;
        String typeName;
        if (!"void".equals(ctx.getText())) {
            typeName = getTypeName(getTypeContext(ctx.returntype()));
            if (ctx.arrayGroup().isEmpty()) {
                type = new SimpleType(typeName);
            } else {
                type = new ArrayType(typeName, ctx.arrayGroup().size());
                ctx.arrayGroup().forEach(
                        array -> ((ArrayType) type).addDim());
            }
        } else {
            type = new VoidType();
        }
        return type;
    }

    public static String getVarName(ReFuggParser.VarDescriptionContext ctx) {
        return ctx.identifier().getText();
    }

    public static String getFunctionName(ReFuggParser.FHeaderContext ctx) {
        return ctx.identifier().getText();
    }

    private String getTypeName(ReFuggParser.TypeContext ctx) {
        if (ctx.identifier() != null) {
            return ctx.identifier().getText();
        } else {
            return ctx.getText();
        }
    }

    private ReFuggParser.TypeContext getTypeContext(ReFuggParser.ReturntypeContext ctx) {
        return ctx.type();
    }

}
