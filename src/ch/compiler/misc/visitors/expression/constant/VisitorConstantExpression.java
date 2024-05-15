package ch.compiler.misc.visitors.expression.constant;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.constantExpression.bool.ConstBooleanExpAnd;
import ch.compiler.misc.nodes.constantExpression.bool.ConstBooleanExpOr;
import ch.compiler.misc.nodes.constantExpression.math.*;
import ch.compiler.misc.nodes.constantExpression.relative.*;
import ch.compiler.misc.nodes.constantExpression.unary.ConstNegExp;
import ch.compiler.misc.nodes.constantExpression.unary.ConstNotExp;
import ch.compiler.misc.nodes.expression.literals.*;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.parser.ReFuggParser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import static ch.compiler.misc.nodes.constantExpression.ConstExpNode.resultType;

public class VisitorConstantExpression extends ReFuggBaseVisitor<ConstExpNode> {

    @Override
    public ConstExpNode visitConstKnownArraysize(ReFuggParser.ConstKnownArraysizeContext ctx) {
        return visitConstExpr((ConstExprContext) ctx.getChild(1));
    }

    @Override
    public ConstExpNode visitConstUnknownArraysize(ReFuggParser.ConstUnknownArraysizeContext ctx) {
        return new IntegerLiteral(Type.UNKNOWN_DIM);
    }

    @Override
    public ConstExpNode visitConstListNoSub(ReFuggParser.ConstListNoSubContext ctx) {
        return visitConstExprMany((ConstExprManyContext) ctx.getChild(1));
    }

    @Override
    public ConstExpNode visitConstListYesSub(ReFuggParser.ConstListYesSubContext ctx) {
        ArrayLiteral array = new ArrayLiteral(visitConstSubList((ConstSubListContext) ctx.getChild(1)));
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object o = ctx.getChild(i);
            if (o instanceof ConstSubListContext) {
                array.add(visitConstSubList((ConstSubListContext) ctx.getChild(i)));
            }
        }
        return array;
    }

    @Override
    public ConstExpNode visitConstSubList(ReFuggParser.ConstSubListContext ctx) {
        return visitConstExprMany((ConstExprManyContext) ctx.getChild(1));
    }

    @Override
    public ConstExpNode visitConstExprMany(ReFuggParser.ConstExprManyContext ctx) {
        if (ctx.getChildCount() > 1) {
            ArrayLiteral array = new ArrayLiteral(visitConstExpr((ConstExprContext) ctx.getChild(0)));
            for (int i = 1; i < ctx.getChildCount(); i++) {
                Object o = ctx.getChild(i);
                if (o instanceof ConstExprContext) {
                    array.add(visitConstExpr((ConstExprContext) ctx.getChild(i)));
                }
            }
            return array;
        } else {
            return new ArrayLiteral(visitConstExpr((ConstExprContext) ctx.getChild(0)));
        }
    }

    @Override
    public ConstExpNode visitConstExpr(ReFuggParser.ConstExprContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstExpr((ConstExprContext) ctx.getChild(0));
            ConstExpNode right = visitConstJoin((ConstJoinContext) ctx.getChild(2));
            return new ConstBooleanExpOr(left, right).evaluate();
        } else if (ctx.getChildCount() == 1) {
            return visitConstJoin((ConstJoinContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstJoin(ReFuggParser.ConstJoinContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstJoin((ConstJoinContext) ctx.getChild(0));
            ConstExpNode right = visitConstEQ((ConstEQContext) ctx.getChild(2));
            return new ConstBooleanExpAnd(left, right).evaluate();
        } else if (ctx.getChildCount() == 1) {
            return visitConstEQ((ConstEQContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstEQ(ReFuggParser.ConstEQContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstEQ((ConstEQContext) ctx.getChild(0));
            ConstExpNode right = visitConstRel((ConstRelContext) ctx.getChild(2));
            String op = ctx.getChild(1).getText();
            if ("==".equals(op) || "is".equals(op)) {
                return new ConstRelExpEQ(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else {
                return new ConstRelExpNE(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            }
        } else if (ctx.getChildCount() == 1) {
            return visitConstRel((ConstRelContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstRel(ReFuggParser.ConstRelContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstRel((ConstRelContext) ctx.getChild(0));
            ConstExpNode right = visitConstLogic((ConstLogicContext) ctx.getChild(2));
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
            return visitConstLogic((ConstLogicContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstLogic(ReFuggParser.ConstLogicContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstLogic((ConstLogicContext) ctx.getChild(0));
            ConstExpNode right = visitConstTerm((ConstTermContext) ctx.getChild(2));
            String op = ctx.getChild(1).getText();
            if ("+".equals(op)) {
                return new ConstMathExpAdd(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("-".equals(op)) {
                return new ConstMathExpSub(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else throw new RuntimeException("");
        } else if (ctx.getChildCount() == 1) {
            return visitConstTerm((ConstTermContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstTerm(ReFuggParser.ConstTermContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstTerm((ConstTermContext) ctx.getChild(0));
            ConstExpNode right = visitConstExpo((ConstExpoContext) ctx.getChild(2));
            String op = ctx.getChild(1).getText();
            if ("*".equals(op)) {
                return new ConstMathExpMul(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("/".equals(op)) {
                return new ConstMathExpDiv(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else if ("%".equals(op)) {
                return new ConstMathExpMod(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
            } else throw new RuntimeException("");
        } else if (ctx.getChildCount() == 1) {
            return visitConstExpo((ConstExpoContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstExpo(ReFuggParser.ConstExpoContext ctx) {
        if (ctx.getChildCount() == 3) {
            ConstExpNode left = visitConstTerm((ConstTermContext) ctx.getChild(0));
            ConstExpNode right = visitConstExpo((ConstExpoContext) ctx.getChild(2));
            return new ConstMathExpExpo(left, right, resultType(left.evaluateType(), right.evaluateType())).evaluate();
        } else if (ctx.getChildCount() == 1) {
            return visitConstUnary((ConstUnaryContext) ctx.getChild(0));
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstUnary(ReFuggParser.ConstUnaryContext ctx) {
        if (ctx.getChildCount() == 2) {
            ConstExpNode exp = visitConstExpo((ConstExpoContext) ctx.getChild(1));
            String op = ctx.getChild(0).getText();
            if ("!".equals(op)) {
                return new ConstNotExp(exp, exp.evaluateType()).evaluate();
            } else if ("-".equals(op)) {
                return new ConstNegExp(exp, exp.evaluateType()).evaluate();
            } else throw new RuntimeException("");
        } else if (ctx.getChildCount() == 1) {
            Object o = ctx.getChild(0);
            if (o instanceof ConstExprConstContext) {
                return visitConstExprConst((ConstExprConstContext) o);
            } else if (o instanceof ConstExprParenthContext) {
                return visitConstExprParenth((ConstExprParenthContext) o);
            } else if (o instanceof ConstExprListContext) {
                return visitConstExprList((ConstExprListContext) o);
            } else throw new RuntimeException("");
        } else throw new RuntimeException("");
    }

    @Override
    public ConstExpNode visitConstExprConst(ReFuggParser.ConstExprConstContext ctx) {
        ParseTree o = ctx.getChild(0);
        String constant = o.getText();
        if ("null".equals(constant)) {
            return new NullLiteral();
        } else if ("this".equals(constant)) {
            throw new RuntimeException("");
        } else if ("false".equals(constant)) {
            return new BooleanLiteral(false);
        } else if ("true".equals(constant)) {
            return new BooleanLiteral(true);
        } else {
            o = o.getChild(0);
            if (o instanceof IntRuleContext) {
                return new IntegerLiteral(Integer.parseInt(o.getText()));
            } else if (o instanceof DoubleRuleContext) {
                return new DoubleLiteral(Double.parseDouble(o.getText()));
            } else if (o instanceof CharRuleContext) {
                String a = o.getText();
                return new CharacterLiteral(a.toCharArray()[0]);
            } else if (o instanceof StringRuleContext) {
                return new StringLiteral(o.getText());
            } else throw new RuntimeException("");
        }
    }

    @Override
    public ConstExpNode visitConstExprParenth(ReFuggParser.ConstExprParenthContext ctx) {
        return visitConstExpr((ConstExprContext) ctx.getChild(1));
    }

    @Override
    public ConstExpNode visitConstExprList(ReFuggParser.ConstExprListContext ctx) {
        Object o = ctx.getChild(0);
        if (o instanceof ReFuggParser.ConstListNoSubContext) {
            return visitConstListNoSub((ConstListNoSubContext) o);
        } else if (o instanceof ReFuggParser.ConstListYesSubContext) {
            return visitConstListYesSub((ConstListYesSubContext) o);
        } else {
            throw new RuntimeException("");
        }
    }
}
