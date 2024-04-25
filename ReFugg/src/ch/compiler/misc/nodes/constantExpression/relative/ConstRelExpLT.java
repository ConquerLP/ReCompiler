package ch.compiler.misc.nodes.constantExpression.relative;

import ch.compiler.misc.nodes.constantExpression.ConstBinaryExp;
import ch.compiler.misc.nodes.constantExpression.ConstExpNode;

public class ConstRelExpLT extends ConstBinaryExp {


    public ConstRelExpLT(ConstExpNode left, ConstExpNode right) {
        super(left, right);
    }

    @Override
    public ConstExpNode evaluate() {
        return null;
    }

    @Override
    public int evaluateType() {
        return 0;
    }
}
