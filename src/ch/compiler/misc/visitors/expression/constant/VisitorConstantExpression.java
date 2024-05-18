package ch.compiler.misc.visitors.expression.constant;

import ch.compiler.misc.nodes.constantExpression.*;
import ch.compiler.misc.nodes.constantExpression.bool.*;
import ch.compiler.misc.nodes.constantExpression.math.*;
import ch.compiler.misc.nodes.constantExpression.relative.*;
import ch.compiler.misc.nodes.constantExpression.unary.*;
import ch.compiler.misc.nodes.expression.literals.*;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.*;

import static ch.compiler.misc.nodes.constantExpression.ConstExpNode.resultType;

public class VisitorConstantExpression extends ReFuggBaseVisitor<ConstExpNode> {

    @Override
    public ConstExpNode visitConstArray(ReFuggParser.ConstArrayContext ctx) {
        if (ctx.constExpr() != null) {
            return visitConstExpr(ctx.constExpr());
        } else {
            return new IntegerLiteral(Type.UNKNOWN_DIM);
        }
    }

    @Override
    public ConstExpNode visitConstList(ConstListContext ctx) {
        if (ctx.constExprMany() != null) {
            return visitConstExprMany(ctx.constExprMany());
        } else {
            ArrayLiteral array = new ArrayLiteral();
            ctx.constSubList().forEach(constSubListContext -> array.add(visitConstSubList(constSubListContext)));
            return array;
        }
    }

    @Override
    public ConstExpNode visitConstSubList(ReFuggParser.ConstSubListContext ctx) {
        return visitConstExprMany(ctx.constExprMany());
    }

    @Override
    public ConstExpNode visitConstExprMany(ReFuggParser.ConstExprManyContext ctx) {
        ArrayLiteral array = new ArrayLiteral();
        ctx.constExpr().forEach(constExprContext -> array.add(visitConstExpr(constExprContext)));
        return array;
    }

    @Override
    public ConstExpNode visitConstExpr(ReFuggParser.ConstExprContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstExpr(ctx.constExpr());
            ConstExpNode right = visitConstJoin(ctx.constJoin());
            return new ConstBooleanExpOr(left, right).evaluate();
        } else if (ctx.getChildCount() == 1) {
            return visitConstJoin(ctx.constJoin());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstJoin(ReFuggParser.ConstJoinContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstJoin(ctx.constJoin());
            ConstExpNode right = visitConstEQ(ctx.constEQ());
            return new ConstBooleanExpAnd(left, right).evaluate();
        } else if (ctx.getChildCount() == 1) {
            return visitConstEQ(ctx.constEQ());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstEQ(ReFuggParser.ConstEQContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstEQ(ctx.constEQ());
            ConstExpNode right = visitConstRel(ctx.constRel());
            String op = ctx.getChild(1).getText();
            if ("==".equals(op) || "is".equals(op)) {
                return new ConstRelExpEQ(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else {
                return new ConstRelExpNE(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            }
        } else if (ctx.getChildCount() == 1) {
            return visitConstRel(ctx.constRel());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstRel(ReFuggParser.ConstRelContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstRel(ctx.constRel());
            ConstExpNode right = visitConstLogic(ctx.constLogic());
            String op = ctx.getChild(1).getText();
            if ("<".equals(op)) {
                return new ConstRelExpLT(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("<=".equals(op)) {
                return new ConstRelExpLE(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if (">".equals(op)) {
                return new ConstRelExpGT(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if (">=".equals(op)) {
                return new ConstRelExpGE(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else throw new RuntimeException("");
        } else if (ctx.getChildCount() == 1) {
            return visitConstLogic(ctx.constLogic());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstLogic(ReFuggParser.ConstLogicContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstLogic(ctx.constLogic());
            ConstExpNode right = visitConstTerm(ctx.constTerm());
            String op = ctx.getChild(1).getText();
            if ("+".equals(op)) {
                return new ConstMathExpAdd(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("-".equals(op)) {
                return new ConstMathExpSub(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else throw new RuntimeException("");
        } else if (ctx.getChildCount() == 1) {
            return visitConstTerm(ctx.constTerm());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstTerm(ReFuggParser.ConstTermContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstTerm(ctx.constTerm());
            ConstExpNode right = visitConstExpo(ctx.constExpo());
            String op = ctx.getChild(1).getText();
            if ("*".equals(op)) {
                return new ConstMathExpMul(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("/".equals(op)) {
                return new ConstMathExpDiv(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("%".equals(op)) {
                return new ConstMathExpMod(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else throw new RuntimeException("");
        } else if (ctx.getChildCount() == 1) {
            return visitConstExpo(ctx.constExpo());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstExpo(ReFuggParser.ConstExpoContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstExpo(ctx.constExpo());
            ConstExpNode right = visitConstUnary(ctx.constUnary());
            return new ConstMathExpExpo(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
        } else if (ctx.getChildCount() == 1) {
            return visitConstUnary(ctx.constUnary());
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstUnary(ReFuggParser.ConstUnaryContext ctx) {
        if (ctx.getChildCount() == 2) {
            ConstExpNode exp = visitConstFactor(ctx.constFactor());
            String op = ctx.preOP().getText();
            if ("!".equals(op)) {
                return new ConstNotExp(exp, exp.evaluateType()).evaluate();
            } else if ("-".equals(op)) {
                return new ConstNegExp(exp, exp.evaluateType()).evaluate();
            } else if ("+".equals(op)) {
                return new ConstPosExp(exp, exp.evaluateType()).evaluate();
            } else throw new RuntimeException("");
        } else {
            return visitConstFactor(ctx.constFactor());
        }
    }

    @Override
    public ConstExpNode visitConstFactor(ConstFactorContext ctx) {
        if (ctx.constant() != null) {
            return visitConstant(ctx.constant());
        } else if (ctx.constExpr() != null) {
            return visitConstExpr(ctx.constExpr());
        } else if (ctx.constList() != null) {
            return visitConstList(ctx.constList());
        } else if (ctx.constVar() != null) {
            return visitConstVar(ctx.constVar());
        } else if (ctx.constArrayAccess() != null) {
            return visitConstArrayAccess(ctx.constArrayAccess());
        } else {
            throw new RuntimeException("");
        }
    }

    @Override
    public ConstExpNode visitConstant(ConstantContext ctx) {
        if (ctx.doubleRule() != null) {
            return new VisitorConstant().visitDoubleRule(ctx.doubleRule());
        } else if (ctx.intRule() != null) {
            return new VisitorConstant().visitIntRule(ctx.intRule());
        } else if (ctx.stringRule() != null) {
            return new VisitorConstant().visitStringRule(ctx.stringRule());
        } else if (ctx.charRule() != null) {
            return new VisitorConstant().visitCharRule(ctx.charRule());
        } else if (ctx.booleanRule() != null) {
            return new VisitorConstant().visitBooleanRule(ctx.booleanRule());
        } else if (ctx.refRule() != null) {
            return new VisitorConstant().visitRefRule(ctx.refRule());
        } else {
            throw new RuntimeException("");
        }
    }

    @Override
    public ConstExpNode visitConstVar(ConstVarContext ctx) {

        return super.visitConstVar(ctx);
    }

    @Override
    public ConstExpNode visitConstArrayAccess(ConstArrayAccessContext ctx) {

        return super.visitConstArrayAccess(ctx);
    }
}
