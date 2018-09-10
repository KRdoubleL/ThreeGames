package org.berlin.threegames;

public class StartGame2Command implements Command{
    Games game;

    public StartGame2Command(Games game) {
        this.game = game;
    }

    public void execute() {
        game.game2Start();
    }
}
