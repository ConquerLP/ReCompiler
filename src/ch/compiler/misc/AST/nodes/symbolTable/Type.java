package ch.compiler.misc.AST.nodes.symbolTable;

import java.util.ArrayList;
import java.util.List;

public class Type {

    private List<Integer> dims = new ArrayList<>();
    private TypeModifier typeModifier;
    private DataType dataType;

    public Type(String type) {
        setUpType(type);
    }

    public void setTypeModifier(TypeModifier typeModifier) {
        this.typeModifier = typeModifier;
    }

    public void addDim(int dim) {
        dims.add(dim);
        if(dims.size() > 1) {
            dataType = DataType.ARRAY;
        }
    }

    public DataType getType() {
        return dataType;
    }

    private void setUpType(String type) {
        switch (type) {
            case "int": {
                this.dataType = DataType.INT;
            }
            break;
            case "double": {
                this.dataType = DataType.DOUBLE;
            }
            break;
            case "String": {
                this.dataType = DataType.STRING;
            }
            break;
            case "char": {
                this.dataType = DataType.CHAR;
            }
            break;
            case "boolean": {
                this.dataType = DataType.BOOLEAN;
            }
            break;
            case "void": {
                this.dataType = DataType.VOID;
            }
            break;
            default:
                this.dataType = DataType.CLASS;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj  == this) return true;
        Type type = (Type) obj;
        return this.dataType.equals(type.dataType) && this.typeModifier.equals(type.typeModifier) && this.dims.equals(type.dims);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
        result = prime * result + ((typeModifier == null) ? 0 : typeModifier.hashCode());
        result = prime * result + ((dims == null) ? 0 : dims.hashCode());
        return result;
    }

}
