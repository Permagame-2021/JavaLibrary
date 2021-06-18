package action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Plant extends Action {
    protected String plantType;

    @JsonCreator
    public Plant(@JsonProperty("line")int line, @JsonProperty("column")int column, @JsonProperty("plantType") String plantType) {
        super(line, column);
        this.plantType = plantType;
    }

    public String getPlantType() {
        return plantType;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "line=" + line +
                ", column=" + column +
                ", plantType='" + plantType + '\'' +
                '}';
    }
}
