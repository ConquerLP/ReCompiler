package ch.compiler.misc.AST.visitors.expression;

import ch.compiler.misc.AST.nodes.expression.ExpressionNode;
import ch.compiler.misc.AST.nodes.expression.access.*;
import ch.compiler.misc.AST.nodes.expression.bool.*;
import ch.compiler.misc.AST.nodes.expression.literals.*;
import ch.compiler.misc.AST.nodes.expression.math.*;
import ch.compiler.misc.AST.nodes.expression.relative.*;
import ch.compiler.misc.AST.nodes.expression.unary.*;
import ch.compiler.misc.AST.visitors.expression.type.VisitorExpressionMany;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class VisitorExpression extends ReFuggBaseVisitor<ExpressionNode> {

    @Override
    public ExpressionNode visitConstArray(ReFuggParser.ConstArrayContext ctx) {
        if (ctx.constExpr() != null) {
            return visitConstExpr(ctx.constExpr());
        } else {
            return null;
        }
    }

    @Override
    public ExpressionNode visitConstList(ReFuggParser.ConstListContext ctx) {
        if (ctx.constExprMany() != null) {
            SimpleListLiteral list = new SimpleListLiteral();
            new VisitorExpressionMany().visitConstExprMany(ctx.constExprMany()).forEach(list::add);
            return list;
        } else {
            MultipleListLiteral list = new MultipleListLiteral();
            ctx.constSubList().forEach(subList -> list.add(new VisitorExpressionMany().visitConstSubList(subList)));
            return list;
        }
    }

    @Override
    public ExpressionNode visitConstVar(ReFuggParser.ConstVarContext ctx) {
        return new VarAccessNode(0, ctx.getText());
    }

    @Override
    public ExpressionNode visitConstArrayAccess(ReFuggParser.ConstArrayAccessContext ctx) {
        List<ExpressionNode> nodes = new ArrayList<>();
        ctx.constExpr().forEach(constExpr -> nodes.add(visitConstExpr(constExpr)));
        return new ArrayAccess(visitVarAccess(ctx.identifier()), nodes);
    }

    @Override
    public ExpressionNode visitConstExpr(ReFuggParser.ConstExprContext ctx) {
        if (ctx.constExpr() != null) {
            return new BinaryExpressionOr(visitConstExpr(ctx.constExpr()), visitConstJoin(ctx.constJoin()));
        } else {
            return visitConstJoin(ctx.constJoin());
        }
    }

    @Override
    public ExpressionNode visitConstJoin(ReFuggParser.ConstJoinContext ctx) {
        if (ctx.constJoin() != null) {
            return new BinaryExpressionAnd(visitConstJoin(ctx.constJoin()), visitConstEQ(ctx.constEQ()));
        } else {
            return visitConstEQ(ctx.constEQ());
        }
    }

    @Override
    public ExpressionNode visitConstEQ(ReFuggParser.ConstEQContext ctx) {
        if (ctx.constEQ() != null) {
            switch (ctx.eqOP().getText()) {
                case "==" -> {
                    return new RelativeExpressionEQ(visitConstEQ(ctx.constEQ()), visitConstRel(ctx.constRel()), 0);
                }
                case "!=" -> {
                    return new RelativeExpressionNE(visitConstEQ(ctx.constEQ()), visitConstRel(ctx.constRel()), 0);
                }
                default -> throw new RuntimeException("Unknown equality operator.");
            }
        } else {
            return visitConstRel(ctx.constRel());
        }
    }

    @Override
    public ExpressionNode visitConstRel(ReFuggParser.ConstRelContext ctx) {
        if (ctx.constRel() != null) {
            switch (ctx.relOP().getText()) {
                case "<" -> {
                    return new RelativeExpressionLT(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()), 0);
                }
                case "<=" -> {
                    return new RelativeExpressionLE(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()), 0);
                }
                case ">" -> {
                    return new RelativeExpressionGT(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()), 0);
                }
                case ">=" -> {
                    return new RelativeExpressionGE(visitConstRel(ctx.constRel()), visitConstLogic(ctx.constLogic()), 0);
                }
                default -> throw new RuntimeException("Unknown relational operator.");
            }
        } else {
            return visitConstLogic(ctx.constLogic());
        }
    }

    @Override
    public ExpressionNode visitConstLogic(ReFuggParser.ConstLogicContext ctx) {
        if (ctx.constLogic() != null) {
            switch(ctx.addOP().getText()){
                case "+" -> {
                    return new ExpressionAdd(visitConstLogic(ctx.constLogic()), visitConstTerm(ctx.constTerm()), 0);
                }
                case "-" -> {
                    return new ExpressionSub(visitConstLogic(ctx.constLogic()), visitConstTerm(ctx.constTerm()), 0);
                }
                default -> throw new RuntimeException("Unknown additive operator.");
            }
        } else {
            return visitConstTerm(ctx.constTerm());
        }
    }

    @Override
    public ExpressionNode visitConstTerm(ReFuggParser.ConstTermContext ctx) {
        if (ctx.constTerm() != null) {
            switch(ctx.multOP().getText()){
                case "*" -> {
                    return new ExpressionMul(visitConstTerm(ctx.constTerm()), visitConstExpo(ctx.constExpo()), 0);
                }
                case "/" -> {
                    return new ExpressionDiv(visitConstTerm(ctx.constTerm()), visitConstExpo(ctx.constExpo()), 0);
                }
                case "%" -> {
                    return new ExpressionMod(visitConstTerm(ctx.constTerm()), visitConstExpo(ctx.constExpo()), 0);
                }
                default -> throw new RuntimeException("Unknown multiplicative operator.");
            }
        } else {
            return visitConstExpo(ctx.constExpo());
        }
    }

    @Override
    public ExpressionNode visitConstExpo(ReFuggParser.ConstExpoContext ctx) {
        if (ctx.constExpo() != null) {
            return new ExpressionExp(visitConstExpo(ctx.constExpo()), visitConstUnary(ctx.constUnary()), 0);
        } else {
            return visitConstUnary(ctx.constUnary());
        }
    }

    @Override
    public ExpressionNode visitConstUnary(ReFuggParser.ConstUnaryContext ctx) {
        if (ctx.preOP() != null) {
            return switch (ctx.preOP().getText()) {
                case "!", "not" -> new NotExpression(0, visitConstFactor(ctx.constFactor()));
                case "-" -> new NegateExpression(0, visitConstFactor(ctx.constFactor()));
                case "+" -> visitConstFactor(ctx.constFactor());
                default -> throw new RuntimeException("Unknown unary operator.");
            };
        } else {
            return visitConstFactor(ctx.constFactor());
        }
    }

    @Override
    public ExpressionNode visitConstFactor(ReFuggParser.ConstFactorContext ctx) {
        if (ctx.constant() != null) {
            return visitConstant(ctx.constant());
        } else if (ctx.constArrayAccess() != null) {
            return visitConstArrayAccess(ctx.constArrayAccess());
        } else if (ctx.constVar() != null) {
            return visitConstVar(ctx.constVar());
        } else {
            return visitConstExpr(ctx.constExpr());
        }
    }

    @Override
    public ExpressionNode visitArrayAccess(ReFuggParser.ArrayAccessContext ctx) {
        return visitExpression(ctx.expression());
    }

    @Override
    public ExpressionNode visitMethodCall(ReFuggParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }

    @Override
    public ExpressionNode visitNewObject(ReFuggParser.NewObjectContext ctx) {
        return super.visitNewObject(ctx);
    }

    @Override
    public ExpressionNode visitFCall(ReFuggParser.FCallContext ctx) {
        return super.visitFCall(ctx);
    }

    @Override
    public ExpressionNode visitThisAcces(ReFuggParser.ThisAccesContext ctx) {
        List<ExpressionNode> nodes = new ArrayList<>();
        if(ctx.exprTail() != null){
            ctx.exprTail().forEach(expr -> nodes.add(visitExprTail(expr)));
        }
        return new AccessNode(0, nodes);
    }

    @Override
    public ExpressionNode visitExprTail(ReFuggParser.ExprTailContext ctx) {
        ExpressionNode first;
        if (ctx.identifier() != null) {
            first = new VarAccessNode(0, ctx.identifier().getText());
        } else if (ctx.methodCall() != null) {
            first = new VisitorExpression().visitMethodCall(ctx.methodCall());
        } else {
            throw new RuntimeException("Invalid expression tail.");
        }
        List<ExpressionNode> nodes = new ArrayList<>();
        nodes.add(first);
        if (ctx.arrayAccess() != null) {
            ctx.arrayAccess().forEach(arrayAccess -> nodes.add(new VisitorExpression().visitArrayAccess(arrayAccess)));
        }
        return new ExpressionTail(first, nodes);
    }

    @Override
    public ExpressionNode visitVarAcces(ReFuggParser.VarAccesContext ctx) {
        return new VarAccessNode(0, ctx.getText());
    }

    public VarAccessNode visitVarAccess(ReFuggParser.IdentifierContext id) {
        return new VarAccessNode(0, id.getText());
    }

    @Override
    public ExpressionNode visitLh_expression(ReFuggParser.Lh_expressionContext ctx) {
        if (ctx.thisAcces() != null) {
            return visitThisAcces(ctx.thisAcces());
        } else {
            return visitVarAcces(ctx.varAcces());
        }
    }

    @Override
    public ExpressionNode visitExpression(ReFuggParser.ExpressionContext ctx) {
        if (ctx.lh_expression() != null) {
            ExpressionNode right = null;
            if (ctx.expression() != null) {
                right = visitExpression(ctx.expression());
            } else {
                right = visitList(ctx.list());
            }
            switch (ctx.assignOP().getText()) {
                case "=" -> {
                    return new ExpressionAssign(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                case "+=" -> {
                    return new ExpressionAdd(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                case "-=" -> {
                    return new ExpressionSub(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                case "*=" -> {
                    return new ExpressionMul(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                case "/=" -> {
                    return new ExpressionDiv(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                case "%=" -> {
                    return new ExpressionMod(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                case "^=", "**=" -> {
                    return new ExpressionExp(visitLh_expression(ctx.lh_expression()), right, 0);
                }
                default -> throw new RuntimeException("Unknown assign operator.");
            }
        } else {
            return visitOrExpression(ctx.orExpression());
        }
    }

    @Override
    public ExpressionNode visitOrExpression(ReFuggParser.OrExpressionContext ctx) {
        if (ctx.orExpression() != null) {
            return new BinaryExpressionOr(visitOrExpression(ctx.orExpression()), visitAndExpression(ctx.andExpression()));
        } else {
            return visitAndExpression(ctx.andExpression());
        }
    }

    @Override
    public ExpressionNode visitAndExpression(ReFuggParser.AndExpressionContext ctx) {
        if (ctx.andExpression() != null) {
            return new BinaryExpressionAnd(visitAndExpression(ctx.andExpression()), visitEqualityExpression(ctx.equalityExpression()));
        } else {
            return visitEqualityExpression(ctx.equalityExpression());
        }
    }

    @Override
    public ExpressionNode visitEqualityExpression(ReFuggParser.EqualityExpressionContext ctx) {
        if (ctx.equalityExpression() != null) {
            switch (ctx.eqOP().getText()) {
                case "==" -> {
                    return new RelativeExpressionEQ(visitEqualityExpression(ctx.equalityExpression()), visitRelationalExpression(ctx.relationalExpression()), 0);
                }
                case "!=" -> {
                    return new RelativeExpressionNE(visitEqualityExpression(ctx.equalityExpression()), visitRelationalExpression(ctx.relationalExpression()), 0);
                }
                default -> throw new RuntimeException("Unknown equality operator.");
            }
        } else {
            return visitRelationalExpression(ctx.relationalExpression());
        }
    }

    @Override
    public ExpressionNode visitRelationalExpression(ReFuggParser.RelationalExpressionContext ctx) {
        if (ctx.relationalExpression() != null) {
            switch(ctx.relOP().getText()) {
                case "<" -> {
                    return new RelativeExpressionLT(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()), 0);
                }
                case "<=" -> {
                    return new RelativeExpressionLE(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()), 0);
                }
                case ">" -> {
                    return new RelativeExpressionGT(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()), 0);
                }
                case ">=" -> {
                    return new RelativeExpressionGE(visitRelationalExpression(ctx.relationalExpression()), visitAdditiveExpression(ctx.additiveExpression()), 0);
                }
                default -> throw new RuntimeException("Unknown relational operator.");
            }
        } else {
            return visitAdditiveExpression(ctx.additiveExpression());
        }
    }

    @Override
    public ExpressionNode visitAdditiveExpression(ReFuggParser.AdditiveExpressionContext ctx) {
        if (ctx.additiveExpression() != null) {
            return switch (ctx.addOP().getText()) {
                case "+" -> new ExpressionAdd(visitAdditiveExpression(ctx.additiveExpression()), visitMultiplicativeExpression(ctx.multiplicativeExpression()), 0);
                case "-" -> new ExpressionSub(visitAdditiveExpression(ctx.additiveExpression()), visitMultiplicativeExpression(ctx.multiplicativeExpression()), 0);
                default -> throw new RuntimeException("Unknown additive operator.");
            };
        } else {
            return visitMultiplicativeExpression(ctx.multiplicativeExpression());
        }
    }

    @Override
    public ExpressionNode visitMultiplicativeExpression(ReFuggParser.MultiplicativeExpressionContext ctx) {
        if (ctx.multiplicativeExpression() != null) {
            switch (ctx.multOP().getText()) {
                case "*" -> {
                    return new ExpressionMul(visitMultiplicativeExpression(ctx.multiplicativeExpression()), visitExponentiationExpression(ctx.exponentiationExpression()), 0);
                }
                case "/" -> {
                    return new ExpressionDiv(visitMultiplicativeExpression(ctx.multiplicativeExpression()), visitExponentiationExpression(ctx.exponentiationExpression()), 0);
                }
                case "%" -> {
                    return new ExpressionMod(visitMultiplicativeExpression(ctx.multiplicativeExpression()), visitExponentiationExpression(ctx.exponentiationExpression()), 0);
                }
                default -> throw new RuntimeException("Unknown multiplicative operator.");
            }
        } else {
            return visitExponentiationExpression(ctx.exponentiationExpression());
        }
    }

    @Override
    public ExpressionNode visitExponentiationExpression(ReFuggParser.ExponentiationExpressionContext ctx) {
        if (ctx.exponentiationExpression() != null) {
            return new ExpressionExp(visitExponentiationExpression(ctx.exponentiationExpression()), visitUnaryExpression(ctx.unaryExpression()), 0);
        } else {
            return visitUnaryExpression(ctx.unaryExpression());
        }
    }

    @Override
    public ExpressionNode visitUnaryExpression(ReFuggParser.UnaryExpressionContext ctx) {
        if (ctx.preOP() != null) {
            return switch (ctx.preOP().getText()) {
                case "!", "not" -> new NotExpression(0, visitUnaryExpression(ctx.unaryExpression()));
                case "-" -> new NegateExpression(0, visitUnaryExpression(ctx.unaryExpression()));
                case "+" -> visitUnaryExpression(ctx.unaryExpression());
                default -> throw new RuntimeException("Unknown unary operator.");
            };
        } else {
            return visitPostExpression(ctx.postExpression());
        }
    }

    @Override
    public ExpressionNode visitPostExpression(ReFuggParser.PostExpressionContext ctx) {
        if (ctx.postOP() != null) {
            switch (ctx.postOP().getText()) {
                case "++" -> {
                    return new PostIncExpression(0, visitPrimary(ctx.primary()));
                }
                case "--" -> {
                    return new PostDecExpression(0, visitPrimary(ctx.primary()));
                }
                default -> throw new RuntimeException("Unknown post operator.");
            }
        } else {
            return visitPrimary(ctx.primary());
        }
    }

    @Override
    public ExpressionNode visitPrimary(ReFuggParser.PrimaryContext ctx) {
        if (ctx.newObject() != null) {
            return visitNewObject(ctx.newObject());
        } else if (ctx.fCall() != null) {
            return visitFCall(ctx.fCall());
        } else if (ctx.varAcces() != null) {
            return visitVarAcces(ctx.varAcces());
        } else if (ctx.thisAcces() != null) {
            return visitThisAcces(ctx.thisAcces());
        } else if (ctx.constant() != null) {
            return visitConstant(ctx.constant());
        } else {
            return visitOrExpression(ctx.orExpression());
        }
    }

    @Override
    public ExpressionNode visitList(ReFuggParser.ListContext ctx) {
        if (ctx.expressionMany() != null) {
            SimpleListLiteral list = new SimpleListLiteral();
            new VisitorExpressionMany().visitExpressionMany(ctx.expressionMany()).forEach(list::add);
            return list;
        } else {
            MultipleListLiteral list = new MultipleListLiteral();
            ctx.subList().forEach(subList -> list.add(new VisitorExpressionMany().visitSubList(subList)));
            return list;
        }
    }

    @Override
    public ExpressionNode visitConstant(ReFuggParser.ConstantContext ctx) {
        if (ctx.doubleRule() != null) {
            return new DoubleLiteral(Double.parseDouble(ctx.doubleRule().getText()));
        } else if (ctx.intRule() != null) {
            return new DoubleLiteral(Double.parseDouble(ctx.intRule().getText()));
        } else if (ctx.stringRule() != null) {
            return new DoubleLiteral(Double.parseDouble(ctx.stringRule().getText()));
        } else if (ctx.booleanRule() != null) {
            return new DoubleLiteral(Double.parseDouble(ctx.booleanRule().getText()));
        } else {
            return new NullLiteral();
        }
    }

}
