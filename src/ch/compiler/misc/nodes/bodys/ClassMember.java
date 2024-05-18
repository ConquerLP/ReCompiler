package ch.compiler.misc.nodes.bodys;

import ch.compiler.misc.nodes.statements.Block;
import ch.compiler.misc.nodes.symbolTable.Access;
import ch.compiler.misc.nodes.symbolTable.SymbolTable;
import ch.compiler.misc.nodes.symbolTable.Type;
import ch.compiler.misc.nodes.symbolTable.TypeModifier;

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
