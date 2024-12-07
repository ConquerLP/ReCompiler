package ch.compiler.visitor.ASTgenerator.expression.constant;

import ch.compiler.AST.expression.constant.binary.eq.*;
import ch.compiler.AST.expression.constant.binary.op.*;
import ch.compiler.AST.expression.constant.binary.rel.*;
import ch.compiler.AST.expression.constant.c_ExprNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VConstBinary extends ReFuggBaseVisitor<c_ExprNode> {

    @Override
    public c_ExprNode visitConstJoin(ReFuggParser.ConstJoinContext ctx) {
        if(ctx.andOP() != null) {
            return new c_AndExprNode(visitConstJoin(ctx.constJoin()), visitConstEQ(ctx.constEQ()));
        } else {
            return visitConstEQ(ctx.constEQ());
        }
    }

    @Override
    public c_ExprNode visitConstEQ(ReFuggParser.ConstEQContext ctx) {
        if(ctx.eqOP() != null) {
            return switch(ctx.eqOP().getText()) {
                case "==" ->
                    new c_EQExprNode(visitConstEQ(ctx.constEQ()), visitConstRel(ctx.constRel()));
                case "!=" ->
                    new c_NQExprNode(visitConstEQ(ctx.constEQ()), visitConstRel(ctx.constRel()));
                default ->
                    throw new RuntimeException("Unknown equality operator: " + ctx.eqOP().getText());
            };
        } else {
            return visitConstRel(ctx.constRel());
        }
    }

    @Override
    public c_ExprNode visitConstRel(ReFuggParser.ConstRelContext ctx) {
        if(ctx.relOP() != null) {
            return switch (ctx.relOP().getText()) {
                case "<" ->
                    new c_LTExprNode(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()));
                case "<=" ->
                    new c_LEExprNode(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()));
                case ">" ->
                    new c_GTExprNode(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()));
                case ">=" ->
                    new c_GEExprNode(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()));
                default ->
                    throw new RuntimeException("Unknown relational operator: " + ctx.relOP().getText());
            };
        } else {
            return visitConstLogic(ctx.constLogic());
        }
    }

    @Override
    public c_ExprNode visitConstLogic(ReFuggParser.ConstLogicContext ctx) {
        if(ctx.constLogic() != null) {
            return switch (ctx.constLogic().getText()) {
                case "+" ->
                    new c_AddExprNode(visitConstLogic(ctx.constLogic()), visitConstTerm(ctx.constTerm()));
                case "-" ->
                    new c_SubExprNode(visitConstLogic(ctx.constLogic()), visitConstTerm(ctx.constTerm()));
                default ->
                    throw new RuntimeException("Unknown logical operator: " + ctx.constLogic().getText());
            };
        } else {
            return visitConstTerm(ctx.constTerm());
        }
    }

    @Override
    public c_ExprNode visitConstTerm(ReFuggParser.ConstTermContext ctx) {
        if(ctx.multOP() != null) {
            return switch (ctx.multOP().getText()) {
                case "*" ->
                    new c_MultExprNode(visitConstTerm(ctx.constTerm()), visitConstExpo(ctx.constExpo()));
                case "/" ->
                    new c_DivExprNode(visitConstTerm(ctx.constTerm()), visitConstExpo(ctx.constExpo()));
                case "%" ->
                    new c_ModExprNode(visitConstTerm(ctx.constTerm()), visitConstExpo(ctx.constExpo()));
                default ->
                    throw new RuntimeException("Unknown term operator: " + ctx.multOP().getText());
            };
        } else {
            return visitConstExpo(ctx.constExpo());
        }
    }

    @Override
    public c_ExprNode visitConstExpo(ReFuggParser.ConstExpoContext ctx) {
        if(ctx.expOP() != null) {
            return switch (ctx.expOP().getText()) {
                case "^", "**" ->
                    new c_ExpoExprNode(visitConstUnary(ctx.constUnary()), visitConstExpo(ctx.constExpo()));
                default ->
                    throw new RuntimeException("Unknown exponentiation operator: " + ctx.expOP().getText());
            };
        } else {
            return new VConstUnary().visitConstUnary(ctx.constUnary());
        }
    }

}
