package ch.compiler.misc.nodes.expression;

import java.util.List;
import java.util.ArrayList;

public class MethodCall extends Expression{

	public String methodName;
	public String className;
	public List<Expression> args;
	
}
