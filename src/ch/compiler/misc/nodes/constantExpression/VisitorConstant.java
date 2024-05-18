package ch.compiler.misc.nodes.constantExpression;

import ch.compiler.misc.nodes.expression.literals.*;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorConstant extends ReFuggBaseVisitor<ConstExpNode> {

    @Override
    public ConstExpNode visitDoubleRule(ReFuggParser.DoubleRuleContext ctx) {
        return new DoubleLiteral(Double.parseDouble(ctx.getText()));
    }

    @Override
    public ConstExpNode visitIntRule(ReFuggParser.IntRuleContext ctx) {
        return new IntegerLiteral(Integer.parseInt(ctx.getText()));
    }

    @Override
    public ConstExpNode visitStringRule(ReFuggParser.StringRuleContext ctx) {
        return new StringLiteral(ctx.getText());
    }

    @Override
    public ConstExpNode visitCharRule(ReFuggParser.CharRuleContext ctx) {
        return new CharacterLiteral(ctx.getText().charAt(0));
    }

    @Override
    public ConstExpNode visitBooleanRule(ReFuggParser.BooleanRuleContext ctx) {
        return new BooleanLiteral(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public ConstExpNode visitRefRule(ReFuggParser.RefRuleContext ctx) {
        String value = ctx.getText();
        if("this".equals(value)) {
            return new ThisLiteral();
        } else if("null".equals(value)) {
            return new NullLiteral();
        } else {
            throw new RuntimeException("");
        }
    }
}
