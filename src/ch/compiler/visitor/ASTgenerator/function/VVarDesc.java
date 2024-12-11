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
        String typeName = getTypeName(ctx.returntype());
        if (!"void".equals(typeName)) {
            if (ctx.arrayGroup().isEmpty()) {
                type = new SimpleType(typeName);
            } else {
                type = new ArrayType(typeName, ctx.arrayGroup().size());
                ctx.arrayGroup().forEach(
                        array -> ((ArrayType) type).addDim());
            }
        } else {
            if(ctx.arrayGroup() != null) {
                if(!ctx.arrayGroup().isEmpty()) {
                    throw new RuntimeException("Void type cannot be an array");
                }
            }
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

    private String getTypeName(ReFuggParser.ReturntypeContext ctx) {
        if (ctx.type() != null) {
            if (ctx.type().identifier() != null) {
                return ctx.type().identifier().getText();
            } else {
                return ctx.type().getText();
            }
        } else {
            return ctx.getText();
        }
    }

}
