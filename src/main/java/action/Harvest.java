package action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Harvest extends Action {
    @JsonCreator
    public Harvest(@JsonProperty("line")int line, @JsonProperty("column")int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
