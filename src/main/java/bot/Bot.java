package bot;

import lib.GameLibrary;
import state.game.Game;

import java.io.IOException;
import java.util.Random;

public class Bot {
    protected final GameLibrary GAME_LIBRARY;

    protected Game game;
    protected final String PLANT_TYPE = "CORN";

    protected final int SLEEPING_TIME = 400;

    public Bot() {
        this.GAME_LIBRARY = GameLibrary.getInstance();
    }

    public void start() throws IOException {
        while(true) {
            this.game = this.GAME_LIBRARY.fetchState();
            this.doAction();
            this.sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(SLEEPING_TIME);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void doAction() throws IOException {
        Random rn = new Random();

        int gardenLength = this.game.getGarden().length;

        int line = rn.nextInt(gardenLength);
        int column = rn.nextInt(gardenLength);

        this.GAME_LIBRARY.plant(line, column, PLANT_TYPE);
    }
}
