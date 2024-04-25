package ch.compiler.misc.nodes.symbolTable.value;

public class EmptyValue extends Value {

    @Override
    public String getType() {
        return "empty";
    }

}
