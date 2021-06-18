package state.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import plant.Plant;

public class Parcel {
    protected Plant plant;
    protected double soilQualityPercentage;
    protected ParcelHistory parcelHistory;

    @JsonCreator
    public Parcel(@JsonProperty("plant")Plant plant, @JsonProperty("soilQualityPercentage")double soilQualityPercentage, @JsonProperty("playerHistory")ParcelHistory parcelHistory) {
        this.plant = plant;
        this.soilQualityPercentage = soilQualityPercentage;
        this.parcelHistory = parcelHistory;
    }

    public boolean hasPlant() {
        return this.plant != null;
    }

    public Plant getPlant() {
        return plant;
    }

    public double getSoilQualityPercentage() {
        return soilQualityPercentage;
    }

    public ParcelHistory getParcelHistory() {
        return parcelHistory;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "plant=" + plant +
                ", soilQualityPercentage=" + soilQualityPercentage +
                ", parcelHistory=" + parcelHistory +
                '}';
    }
}
