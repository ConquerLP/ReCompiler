package ch.compiler.misc.nodes.expression;

public abstract class BinaryExpression extends ExpressionNode {

    protected ExpressionNode left;
    protected ExpressionNode right;

    public BinaryExpression(ExpressionNode left, ExpressionNode right, int type){
        super(type);
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluateType(){
        int leftType = left.evaluateType();
        int rightType = right.evaluateType();
        return resultType(leftType, rightType);
    }

}
