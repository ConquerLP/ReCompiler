package ch.compiler.misc.nodes.symbolTable.value;

public enum ValueTypes {

    INT("int"){
        @Override
        public String toString() {
            return "int";
        }
    }, DOUBLE("double"){
        @Override
        public String toString() {
            return "double";
        }
    }, STRING("String"){
        @Override
        public String toString() {
            return "String";
        }
    }, CHAR("char"){
        @Override
        public String toString() {
            return "char";
        }
    };
    private final String type;

    ValueTypes(String type){
        this.type = type;
    }

}
