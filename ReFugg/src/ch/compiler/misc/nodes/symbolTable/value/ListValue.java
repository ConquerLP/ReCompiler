package ch.compiler.misc.nodes.symbolTable.value;

import java.util.List;
import java.util.ArrayList;

public class ListValue extends Value{
	
	public List<Value> values;

	public ListValue() {
		values = new ArrayList<>();
	}
	
	public void addValue(Value v) {
		values.add(v);
	}
	
	public List<Value> getValue() {
		return values;
	}

	@Override
	public String getType() {
		return "List";
	}
}
