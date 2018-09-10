package org.berlin.threegames;

public class StartGame1Command implements Command{
    Games game;

    public StartGame1Command(Games game) {
        this.game = game;
    }

    public void execute() {
        game.game1Start();
    }
}
