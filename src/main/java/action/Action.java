package action;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "action")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Plant.class, name = "plant"),
        @JsonSubTypes.Type(value = Harvest.class, name = "harvest"),
        @JsonSubTypes.Type(value = Fertilize.class, name = "fertilize")
})
public abstract class Action {
    protected int line;
    protected int column;

    public Action( int line,int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
