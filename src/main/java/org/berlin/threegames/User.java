package org.berlin.threegames;

public class User {
    Command game1Start;
    Command game2Start;
    Command game3Start;

    public User(Command game1Start, Command game2Start, Command game3Start) {
        this.game1Start = game1Start;
        this.game2Start = game2Start;
        this.game3Start = game3Start;
    }

    void firstGameStart() {
        game1Start.execute();
    }

    void secondGameStart() {
        game2Start.execute();
    }

    void thirdGameStart() {
        game3Start.execute();
    }
}
