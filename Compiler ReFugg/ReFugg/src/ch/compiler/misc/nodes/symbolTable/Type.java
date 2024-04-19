package ch.compiler.misc.nodes.symbolTable;

import java.util.List;
import java.util.ArrayList;

public class Type {
	
	private List<Integer> dims;
	private String type;
	private boolean isArray;
	
	public Type(String type, int ... array) {
		this.type = type;
		dims = new ArrayList<>();
		for(int dim : array) {
			dims.add(dim);
		}
	}
	
	public Type(String type, boolean isArray) {
		this.type = type;
		this.isArray = isArray;
	}
	
	public List<Integer> getDims(){
		return dims;
	}
	
	public String getType() {
		return type;
	}
	
}
