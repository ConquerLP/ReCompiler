package ch.compiler.misc.nodes.constantExpression;

public abstract class ConstBinaryExp extends ConstExpNode {

	protected ConstExpNode left;
	protected ConstExpNode right;
	
	public ConstBinaryExp(ConstExpNode left, ConstExpNode right){
		this.left = left;
		this.right = right;
	}

	public int evaluateType(){
		int leftType = left.evaluateType();
		int rightType = right.evaluateType();
		return resultType(leftType, rightType);
	}
	
}