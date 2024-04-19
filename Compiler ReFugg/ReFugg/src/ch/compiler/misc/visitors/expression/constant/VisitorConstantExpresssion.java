package ch.compiler.misc.visitors.expression.constant;

import ch.compiler.misc.nodes.constexpression.ConstantExpression;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser.ConstDelcContext;
import ch.compiler.parser.ReFuggParser.ConstEQContext;
import ch.compiler.parser.ReFuggParser.ConstExpoContext;
import ch.compiler.parser.ReFuggParser.ConstExprConstContext;
import ch.compiler.parser.ReFuggParser.ConstExprContext;
import ch.compiler.parser.ReFuggParser.ConstExprListContext;
import ch.compiler.parser.ReFuggParser.ConstExprManyContext;
import ch.compiler.parser.ReFuggParser.ConstExprParenthContext;
import ch.compiler.parser.ReFuggParser.ConstJoinContext;
import ch.compiler.parser.ReFuggParser.ConstKnownArraysizeContext;
import ch.compiler.parser.ReFuggParser.ConstListNoSubContext;
import ch.compiler.parser.ReFuggParser.ConstListYesSubContext;
import ch.compiler.parser.ReFuggParser.ConstLogicContext;
import ch.compiler.parser.ReFuggParser.ConstRelContext;
import ch.compiler.parser.ReFuggParser.ConstSubListContext;
import ch.compiler.parser.ReFuggParser.ConstTermContext;
import ch.compiler.parser.ReFuggParser.ConstUnaryContext;
import ch.compiler.parser.ReFuggParser.ConstUnknownArraysizeContext;
import ch.compiler.parser.ReFuggParser.ConstantContext;

public class VisitorConstantExpresssion extends ReFuggBaseVisitor<ConstantExpression>{

	@Override
	public ConstantExpression visitConstKnownArraysize(ConstKnownArraysizeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstKnownArraysize(ctx);
	}

	@Override
	public ConstantExpression visitConstUnknownArraysize(ConstUnknownArraysizeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstUnknownArraysize(ctx);
	}

	@Override
	public ConstantExpression visitConstDelc(ConstDelcContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstDelc(ctx);
	}

	@Override
	public ConstantExpression visitConstListNoSub(ConstListNoSubContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstListNoSub(ctx);
	}

	@Override
	public ConstantExpression visitConstListYesSub(ConstListYesSubContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstListYesSub(ctx);
	}

	@Override
	public ConstantExpression visitConstSubList(ConstSubListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstSubList(ctx);
	}

	@Override
	public ConstantExpression visitConstExprMany(ConstExprManyContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstExprMany(ctx);
	}

	@Override
	public ConstantExpression visitConstExpr(ConstExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstExpr(ctx);
	}

	@Override
	public ConstantExpression visitConstJoin(ConstJoinContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstJoin(ctx);
	}

	@Override
	public ConstantExpression visitConstEQ(ConstEQContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstEQ(ctx);
	}

	@Override
	public ConstantExpression visitConstRel(ConstRelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstRel(ctx);
	}

	@Override
	public ConstantExpression visitConstLogic(ConstLogicContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstLogic(ctx);
	}

	@Override
	public ConstantExpression visitConstTerm(ConstTermContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstTerm(ctx);
	}

	@Override
	public ConstantExpression visitConstExpo(ConstExpoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstExpo(ctx);
	}

	@Override
	public ConstantExpression visitConstUnary(ConstUnaryContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstUnary(ctx);
	}

	@Override
	public ConstantExpression visitConstExprConst(ConstExprConstContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstExprConst(ctx);
	}

	@Override
	public ConstantExpression visitConstExprParenth(ConstExprParenthContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstExprParenth(ctx);
	}

	@Override
	public ConstantExpression visitConstExprList(ConstExprListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstExprList(ctx);
	}

	@Override
	public ConstantExpression visitConstant(ConstantContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstant(ctx);
	}
	
	
	
	
	
}
