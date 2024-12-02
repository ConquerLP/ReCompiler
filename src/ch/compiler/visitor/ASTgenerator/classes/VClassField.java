package ch.compiler.visitor.ASTgenerator.classes;

import ch.compiler.AST.expression.vars.MemberVarDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.expression.constant.VConstExpr;
import ch.compiler.visitor.ASTgenerator.function.VVarDesc;
import ch.compiler.visitor.ASTgenerator.typeModifier.VTypeModifier;

public class VClassField extends ReFuggBaseVisitor<MemberVarDecNode> {

    @Override
    public MemberVarDecNode visitClassField(ReFuggParser.ClassFieldContext ctx) {
        MemberVarDecNode memberVarDecNode = new MemberVarDecNode(VVarDesc.getVarName(ctx.varDescription()),
                new VVarDesc().visitVarDescription(ctx.varDescription()),
                new VTypeModifier().visitTypemodifier(ctx.typemodifier()));
        if (ctx.constInit() != null) {
            memberVarDecNode.setExpr(new VConstExpr().visitConstInit(ctx.constInit()));
        }
        return memberVarDecNode;
    }

}
