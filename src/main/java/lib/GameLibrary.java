package lib;

import action.Fertilize;
import action.Harvest;
import action.Plant;
import plantTypes.PlantType;
import service.Service;
import state.game.Game;
import state.game.PlantFamilies;
import state.game.PlayerAction;

import java.io.IOException;

public class GameLibrary {
    private final Service SERVICE;

    private static GameLibrary instance;

    private GameLibrary() {
        this.SERVICE = Service.getInstance();
    }

    public static GameLibrary getInstance() {
        if(GameLibrary.instance == null) {
            GameLibrary.instance = new GameLibrary();
        }

        return GameLibrary.instance;
    }

    public Game fetchState() {
        return (Game) this.SERVICE.doGET("/state");
    }

    public PlantType[] fetchPlantsTypes() {
        return (PlantType[]) this.SERVICE.doGET("/plants");
    }

    public PlantFamilies fetchPlantFamilies() {
        return (PlantFamilies) this.SERVICE.doGET("/plantFamilies");
    }

    public PlayerAction[] fetchActionList() {
        return (PlayerAction[]) this.SERVICE.doGET("/actionList");
    }

    public void plant(int line, int column, String plantType) throws IOException {
        this.SERVICE.doPOST(new Plant(line, column, plantType));
    }

    public void harvest(int line, int column) throws IOException {
        this.SERVICE.doPOST(new Harvest(line, column));
    }

    public void fertilize(int line, int column) throws IOException {
        this.SERVICE.doPOST(new Fertilize(line, column));
    }
}
