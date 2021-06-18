package state.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Game {
    protected Parcel[][] garden;
    protected PlayerAction[] actions;
    protected int globalScore;
    protected Player[] players;

    @JsonCreator
    public Game(@JsonProperty("garden")Parcel[][] garden, @JsonProperty("globalScore")int globalScore, @JsonProperty("actions")PlayerAction[] actions, @JsonProperty("players") Player[] players) {
        this.garden = garden;
        this.globalScore = globalScore;
        this.actions = actions;
        this.players = players;
    }

    public Parcel[][] getGarden() {
        return garden;
    }

    public PlayerAction[] getActions() {
        return actions;
    }

    public int getGlobalScore() {
        return globalScore;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Parcel getParcelAt(int line, int column) {
        return garden[line][column];
    }

    @Override
    public String toString() {
        return "Game{" +
                "actions=" + Arrays.toString(actions) +
                '}';
    }
}
