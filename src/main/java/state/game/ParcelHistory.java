package state.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class ParcelHistory {
    protected HashMap<String, Integer> playerInteraction;
    protected int totalExpenses;

    @JsonCreator
    public ParcelHistory(@JsonProperty("playerInteraction") HashMap<String, Integer> playerInteraction, @JsonProperty("totalExpenses")int totalExpenses) {
        this.playerInteraction = playerInteraction;
        this.totalExpenses = totalExpenses;
    }

    public HashMap<String, Integer> getPlayerInteraction() {
        return playerInteraction;
    }

    public int getTotalExpenses() {
        return totalExpenses;
    }

    @Override
    public String toString() {
        return "ParcelHistory{" +
                "playerInteraction=" + playerInteraction +
                ", totalExpense=" + totalExpenses +
                '}';
    }
}
