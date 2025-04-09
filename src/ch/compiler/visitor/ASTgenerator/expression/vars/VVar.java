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

import static ch.compiler.utils.ASTUtils.withPosition;

public class VVar extends ReFuggBaseVisitor<VarDecNode> {

    @Override
    public VarDecNode visitVarDec(ReFuggParser.VarDecContext ctx) {
        if (ctx.orExpression() != null) {
            return withPosition(new LocalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                    new VVarDesc().visitVarDescription(ctx.varDescription()),
                    new VTypeModifier().visitTypemodifier(ctx.typemodifier()),
                    new VBinary().visitOrExpression(ctx.orExpression())), ctx);
        } else if (ctx.list() != null) {
            return withPosition(new LocalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                    new VVarDesc().visitVarDescription(ctx.varDescription()),
                    new VTypeModifier().visitTypemodifier(ctx.typemodifier()),
                    new VList().visitList(ctx.list())), ctx);
        } else {
            return withPosition(new LocalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                    new VVarDesc().visitVarDescription(ctx.varDescription()),
                    new VTypeModifier().visitTypemodifier(ctx.typemodifier())), ctx);
        }
    }

    @Override
    public GlobalVarDecNode visitGlobalVar(ReFuggParser.GlobalVarContext ctx) {
        return withPosition(new GlobalVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                new VVarDesc().visitVarDescription(ctx.varDescription()),
                new VTypeModifier().visitTypemodifier(ctx.typemodifier()),
                new VConstExpr().visitConstInit(ctx.constInit())), ctx);
    }

}
