package ch.compiler.misc.nodes.symbolTable;

import ch.compiler.misc.nodes.constantExpression.ConstExpNode;
import ch.compiler.misc.nodes.expression.ExpressionNode;
import ch.compiler.misc.nodes.expression.literals.IntegerLiteral;
import ch.compiler.misc.visitors.expression.constant.VisitorConstantExpression;
import ch.compiler.parser.ReFuggParser;

import java.util.ArrayList;
import java.util.List;

public class Type {

    private List<Integer> dims;
    private int type;
    public final static int UNKNOWN_DIM = -1;
    private boolean isArray;

    public Type(ReFuggParser.GlobalYesInitContext ctx) {
        init(ctx);
    }

    public Type(ReFuggParser.GlobalNoInitContext ctx) {
        init(ctx);
    }

    public Type(ReFuggParser.VarDecContext ctx) {
        init(ctx);
    }

    public Type(ReFuggParser.VarDecStatementContext ctx) {
        init(ctx);
    }

    private void init(org.antlr.v4.runtime.tree.ParseTree ctx) {
        setUpType(ctx.getChild(1).getText());
        dims = new ArrayList<>();
        ConstExpNode node;
        for (int i = 2; i < ctx.getChildCount(); i++) {
            Object o = ctx.getChild(i);
            if (o instanceof ReFuggParser.ConstUnknownArraysizeContext) {
                node = new VisitorConstantExpression().visitConstUnknownArraysize((ReFuggParser.ConstUnknownArraysizeContext) o);
            } else if (o instanceof ReFuggParser.ConstKnownArraysizeContext) {
                node = new VisitorConstantExpression().visitConstKnownArraysize((ReFuggParser.ConstKnownArraysizeContext) o);
            } else if (o instanceof ReFuggParser.ConstKnownArraysizeContext) {
                node = new VisitorConstantExpression().visitConstKnownArraysize((ReFuggParser.ConstKnownArraysizeContext) o);
            }  else {
                continue;
            }
            if (node instanceof IntegerLiteral) {
                dims.add(((IntegerLiteral) node).getValue());
            } else {
                throw new RuntimeException("");
            }
        }
        isArray = dims.size() > 1 ? true : false;
    }

    public List<Integer> getDims() {
        return dims;
    }

    public int getType() {
        return type;
    }

    private void setUpType(String type) {
        switch (type) {
            case "int": {
                this.type = ExpressionNode.INT;
            }
            break;
			case "double": {
				this.type = ExpressionNode.DOUBLE;
			}
			break;
			case "String": {
				this.type = ExpressionNode.STRING;
			}
			break;
			case "char": {
				this.type = ExpressionNode.CHAR;
			}
			break;
			case "boolean": {
				this.type = ExpressionNode.BOOLEAN;
			}
			break;
			case "void": {
				this.type = ExpressionNode.VOID;
			}
			break;
			default: this.type = ExpressionNode.CLASS;
        }
    }

}
