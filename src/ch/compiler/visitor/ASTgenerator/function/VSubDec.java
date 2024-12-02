package ch.compiler.visitor.ASTgenerator.function;

import ch.compiler.AST.function.ConstructorNode;
import ch.compiler.AST.function.FunctionNode;
import ch.compiler.AST.function.MethodNode;
import ch.compiler.AST.function.SubDecNode;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;
import ch.compiler.visitor.ASTgenerator.statement.block.VFunctionBlock;

public class VSubDec extends ReFuggBaseVisitor<SubDecNode> {

    @Override
    public FunctionNode visitFunc(ReFuggParser.FuncContext ctx) {
        return new FunctionNode(VVarDesc.getFunctionName(ctx.fHeader()),
                new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()),
                new VArgList().visitArgList(ctx.fParam().argList()),
                new VVarDesc().visitFHeader(ctx.fHeader()));
    }

    @Override
    public MethodNode visitMethod(ReFuggParser.MethodContext ctx) {
        return new MethodNode(VVarDesc.getFunctionName(ctx.fHeader()),
                new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()),
                new VArgList().visitArgList(ctx.fParam().argList()),
                new VVarDesc().visitFHeader(ctx.fHeader()));
    }

    @Override
    public ConstructorNode visitClassConstructor(ReFuggParser.ClassConstructorContext ctx) {
        return new ConstructorNode(new VFunctionBlock().visitFunctionBlock(ctx.functionBlock()),
                new VArgList().visitArgList(ctx.fParam().argList()));
    }
}
