package ch.compiler.visitor.ASTgenerator.expression.vars;

import ch.compiler.AST.expression.vars.GlobalVarDecNode;
import ch.compiler.AST.expression.vars.LocalVarDecNode;
import ch.compiler.AST.expression.vars.VarDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.constant.VConstExpr;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VBinary;
import ch.compiler.visitor.ASTgenerator.expression.nonConstant.VList;
import ch.compiler.visitor.ASTgenerator.function.VVarDesc;
import ch.compiler.visitor.ASTgenerator.typeModifier.VTypeModifier;

public class VVar extends ReFuggBaseVisitor<VarDecNode> {

    @Override
    public VarDecNode visitVarDec(ReFuggParser.VarDecContext ctx) {
        if(ctx.orExpression() != null ){
            return new LocalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                    new VVarDesc().visitVarDescription(ctx.varDescription()),
                    new VTypeModifier().visitTypemodifier(ctx.typemodifier()),
                    new VBinary().visitOrExpression(ctx.orExpression()));
        } else if(ctx.list() != null ){
            return new LocalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                    new VVarDesc().visitVarDescription(ctx.varDescription()),
                    new VTypeModifier().visitTypemodifier(ctx.typemodifier()),
                    new VList().visitList(ctx.list()));
        } else {
            return new LocalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                    new VVarDesc().visitVarDescription(ctx.varDescription()),
                    new VTypeModifier().visitTypemodifier(ctx.typemodifier()));
        }
    }

    @Override
    public GlobalVarDecNode visitGlobalVar(ReFuggParser.GlobalVarContext ctx) {
        return new GlobalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                new VVarDesc().visitVarDescription(ctx.varDescription()),
                new VTypeModifier().visitTypemodifier(ctx.typemodifier()),
                new VConstExpr().visitConstInit(ctx.constInit()));
    }
}
