package ch.compiler.visitor.ASTgenerator.statement.switchNode;

import ch.compiler.AST.statement.StatementNode;
import ch.compiler.AST.statement.switchNode.SwitchNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.VCheck;

public class VSwitchCase extends ReFuggBaseVisitor<StatementNode> {

    @Override
    public SwitchNode visitSwitchCase(ReFuggParser.SwitchCaseContext ctx) {
        SwitchNode switchNode = new SwitchNode(new VCheck().visitCheck(ctx.check()));
        ctx.caseBlock().forEach(caseBlockContext -> {
            switchNode.addCase(new VCaseBlock().visitCaseBlock(caseBlockContext));
        });
        return switchNode;
    }

}
