package ch.compiler.misc.nodes.statements;

import java.util.List;
import java.util.ArrayList;

public class Block extends Statement{

	public List<Statement> statements;

	public Block() {
		statements = new ArrayList<>();
	}

	public void addStatement(Statement statement) {
		statements.add(statement);
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void addStatement(List<Statement> statements){
		this.statements.addAll(statements);
	}

}
