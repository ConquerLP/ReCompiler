package ch.compiler.misc.visitors.bodys;

import ch.compiler.misc.nodes.bodys.ClassMethod;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.visitors.expression.VisitorReturnType;
import ch.compiler.misc.visitors.statements.VisitorBlock;
import ch.compiler.parser.ReFuggBaseVisitor;
import ch.compiler.parser.ReFuggParser;

public class VisitorClassMethod extends ReFuggBaseVisitor<ClassMethod>{

    @Override
    public ClassMethod visitMethod(ReFuggParser.MethodContext ctx) {
        ReFuggParser.FHeaderContext header = ctx.fHeader();
        ReFuggParser.ReturntypeContext returnType = header.returntype();
        Type type = new VisitorReturnType().visitReturntype(returnType);
        String id = header.identifier().getText();
        ClassMethod classMethod = new ClassMethod(type, id);
        classMethod.setBlock(new VisitorBlock().visitBlock(ctx.block()));
        classMethod.setTable(new VisitorFParam().visitFParam(ctx.fParam()));
        return classMethod;
    }
}