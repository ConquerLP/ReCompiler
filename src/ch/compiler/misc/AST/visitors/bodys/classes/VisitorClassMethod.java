package ch.compiler.misc.AST.visitors.bodys.classes;

import ch.compiler.misc.AST.nodes.bodys.ClassMethod;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.misc.AST.visitors.expression.type.*;
import ch.compiler.misc.AST.visitors.bodys.function.*;
import ch.compiler.misc.AST.visitors.statements.*;
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
        classMethod.setBlock(new VisitorStatement().visitBlock(ctx.block()));
        classMethod.setTable(new VisitorFParam().visitFParam(ctx.fParam()));
        return classMethod;
    }
}