package org.berlin.threegames;

public class StartGame3Command implements Command{
    Games game;

    public StartGame3Command(Games game) {
        this.game = game;
    }

    public void execute() {
        game.game3Start();
    }
}
