package ch.compiler.misc.AST.nodes.bodys;

import ch.compiler.misc.AST.nodes.symbolTable.Access;
import ch.compiler.misc.AST.nodes.symbolTable.Type;
import ch.compiler.misc.AST.nodes.symbolTable.TypeModifier;

public class ClassMember extends ClassInside {

	private TypeModifier typeModifier;

	public ClassMember(Access access, Type type, String name, TypeModifier typeModifier) {
		super(access, type, name);
		init(typeModifier);
	}

	public ClassMember(Type type, String name, TypeModifier typeModifier) {
		super(type, name);
		init(typeModifier);
	}

	private void init(TypeModifier typeModifier){
		this.typeModifier = typeModifier;
	}
	
}
