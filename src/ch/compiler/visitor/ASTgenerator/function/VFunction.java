package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.function.FunctionNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VFunction extends ReFuggBaseVisitor<FunctionNode> {

    @Override
    public FunctionNode visitFunc(ReFuggParser.FuncContext ctx) {
        VFHeader header = new VFHeader();
        return new FunctionNode(header.getFunctionName(ctx.fHeader()),
                new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()),
                new VArgs().visitArgList(ctx.fParam().argList()),
                header.visitFHeader(ctx.fHeader()));
    }

}
