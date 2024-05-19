package ch.compiler.misc.nodes.statements;

import java.util.ArrayList;
import java.util.List;

public class Block extends Statement {

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

}
