package plant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Plant {
    protected String plantType;
    protected String plantName;
    protected String growth;
    protected int age;

    @JsonCreator
    public Plant(@JsonProperty("plantFamily")String plantFamily, @JsonProperty("plantType")String plantType, @JsonProperty("age")int age, @JsonProperty("growth")String growth) {
        this.plantType = plantFamily;
        this.plantName = plantType;
        this.growth = growth;
        this.age = age;
    }

    public String getPlantType() {
        return plantType;
    }

    public String getPlantName() {
        return plantName;
    }

    public String getGrowth() {
        return growth;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantType='" + plantType + '\'' +
                ", plantName='" + plantName + '\'' +
                ", growth='" + growth + '\'' +
                ", age=" + age +
                '}';
    }
}
