package ch.compiler.misc.nodes.symbolTable.value;

public abstract class Value<T> {

    private final int MATCH_INT_DOUBLE = 1, MATCH_INT_CHAR = 2, MATCH_CHAR_STRING = 3;

    public abstract String getType();

    public abstract T getValue();

    public Value add(Value other){
        int matchType = this.tryMatch(other);
        switch (matchType){
            case MATCH_INT_DOUBLE: {
                double val = (double)this.getValue() + (double)other.getValue();
                return new DoubleValue(val);
            }
            case MATCH_INT_CHAR: {
                char val = (char) ((char)this.getValue() + (char)other.getValue());
                return new CharValue(val);
            }
            case MATCH_CHAR_STRING: {
                String val = new String((String) this.getValue() + (String) other.getValue());
                return new StringValue(val);
            }
        }
        throw new RuntimeException("No addition for this type.");
    }



    private int tryMatch(Value other) throws RuntimeException{
        if(this.isInt()) {
            if(this.matchIntDouble(other)) return MATCH_INT_DOUBLE;
            else if(this.matchIntChar(other)) return MATCH_INT_CHAR;
        } else if (this.isDouble()) {
            if(this.matchIntDouble(other)) return MATCH_INT_DOUBLE;
        } else if (this.isChar()) {
            if(this.matchIntChar(other)) return MATCH_INT_CHAR;
            else if(this.matchStringChar(other)) return MATCH_CHAR_STRING;
        } else if (this.isString()) {
            if(this.matchStringChar(other)) return MATCH_CHAR_STRING;
        }
        throw new RuntimeException("Type mismatch.");
    }

    private boolean matchIntDouble(Value other){
        if((this.isInt() || this.isDouble())
            && (other.isInt() || other.isDouble()))
            return true;
        return false;
    }

    private boolean matchIntChar(Value other){
        if((this.isInt() || this.isChar())
                && (other.isInt() || other.isChar()))
            return true;
        return false;
    }

    private boolean matchStringChar(Value other){
        if((this.isString() || this.isChar())
                && (other.isString() || other.isChar()))
            return true;
        return false;
    }

    private boolean isChar(){
        return ValueTypes.CHAR.toString().equals(this.getType());
    }

    private boolean isInt(){
        return ValueTypes.INT.toString().equals(this.getType());
    }

    private boolean isDouble(){
        return ValueTypes.DOUBLE.toString().equals(this.getType());
    }

    private boolean isString(){
        return ValueTypes.STRING.toString().equals(this.getType());
    }

}
