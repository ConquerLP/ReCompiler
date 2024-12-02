package ch.compiler.visitor.ASTgenerator.expression.vars;

import ch.compiler.AST.expression.vars.GlobalVarDecNode;
import ch.compiler.AST.expression.vars.VarDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VVar extends ReFuggBaseVisitor<VarDecNode> {

    @Override
    public VarDecNode visitArgList(ReFuggParser.ArgListContext ctx) {
        return super.visitArgList(ctx);
    }

    @Override
    public VarDecNode visitClassField(ReFuggParser.ClassFieldContext ctx) {
        return super.visitClassField(ctx);
    }

    @Override
    public VarDecNode visitFParam(ReFuggParser.FParamContext ctx) {
        return super.visitFParam(ctx);
    }

    @Override
    public VarDecNode visitVarDec(ReFuggParser.VarDecContext ctx) {
        return super.visitVarDec(ctx);
    }

}
