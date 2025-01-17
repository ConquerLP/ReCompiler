package ch.compiler.misc.nodes.constantExpression;

import ch.compiler.misc.nodes.expression.ExpressionNode;

public abstract class ConstExpNode extends ExpressionNode {

    public final static int INT = 0, DOUBLE = 1, CHAR = 2, STRING = 3, BOOLEAN = 4,
            ARRAY = 5, NULL = 6, THIS = 7;
    protected final int type;

    public ConstExpNode(int type) {
        super(type);
        this.type = type;
    }

    public abstract ConstExpNode evaluate();

    public abstract int evaluateType();

    private static boolean matchIntDouble(int left, int right) {
        return (left == INT || left == DOUBLE) && (right == INT || right == DOUBLE);
    }

    private static boolean matchIntChar(int left, int right) {
        return (left == INT || left == CHAR) && (right == INT || right == CHAR);
    }

    private static boolean matchStringChar(int left, int right) {
        return (left == CHAR || left == STRING) && (right == CHAR || right == STRING);
    }

    public static int resultType(int left, int right) {
        if (left == right) return left;
        else if (matchIntDouble(left, right)) return DOUBLE;
        else if (matchIntChar(left, right)) return CHAR;
        else if (matchStringChar(left, right)) return STRING;
        else throw new RuntimeException("Type mismatch.");
    }

}