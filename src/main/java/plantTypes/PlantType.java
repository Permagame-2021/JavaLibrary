package plantTypes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlantType {
    protected String plantName;
    protected String plantFamily;
    protected String nutrientNeed;
    protected int points;
    protected int turnToBeReady;
    protected int turnToDie;
    protected String readyImg;

    @JsonCreator
    public PlantType(@JsonProperty("plantName")String plantName, @JsonProperty("plantFamily")String plantFamily, @JsonProperty("nutrientNeed")String nutrientNeed, @JsonProperty("points")int points, @JsonProperty("turnToBeReady")int turnToBeReady, @JsonProperty("turnToDie")int turnToDie, @JsonProperty("readyImg")String readyImg) {
        this.plantName = plantName;
        this.plantFamily = plantFamily;
        this.nutrientNeed = nutrientNeed;
        this.points = points;
        this.turnToBeReady = turnToBeReady;
        this.turnToDie = turnToDie;
        this.readyImg = readyImg;
    }

    public String getPlantName() {
        return plantName;
    }

    public String getPlantFamily() {
        return plantFamily;
    }

    public String getNutrientNeed() {
        return nutrientNeed;
    }

    public int getPoints() {
        return points;
    }

    public int getTurnToBeReady() {
        return turnToBeReady;
    }

    public int getTurnToDie() {
        return turnToDie;
    }

    public String getReadyImg() {
        return readyImg;
    }

    @Override
    public String toString() {
        return "PlantType{" +
                "plantName='" + plantName + '\'' +
                ", plantFamily='" + plantFamily + '\'' +
                ", nutrientNeed='" + nutrientNeed + '\'' +
                ", points=" + points +
                ", turnToBeReady=" + turnToBeReady +
                ", turnToDie=" + turnToDie +
                ", readyImg='" + readyImg + '\'' +
                '}';
    }
}
