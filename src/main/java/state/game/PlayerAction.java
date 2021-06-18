package state.game;

import action.Action;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerAction {
    protected String playerName;
    protected Action action;

    @JsonCreator
    public PlayerAction(@JsonProperty("playerName") String playerName, @JsonProperty("action") action.Action action) {
        this.playerName = playerName;
        this.action = action;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Action getAction() {
        return action;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + playerName + '\'' +
                ", action=" + action +
                '}';
    }
}
