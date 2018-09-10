package org.berlin.threegames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Games game = new Games();
        User u = new User(new StartGame1Command(game), new StartGame2Command(game), new StartGame3Command(game));
        System.out.println("Choose a game:");
        System.out.println("To choose first game You need to type: \"FIRSTGAME\", " +
                "\nto choose second game You need to type: \"SECONDGAME\", " +
                "\nto choose third game You need to type: \"THIRDGAME\".");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberOfAGame = br.readLine();
        // using enums
        //have no idea how to write this code without if/else or switch
        if (numberOfAGame.equals("FIRSTGAME")) {
            System.out.println(Game.FIRSTGAME);
        } else if (numberOfAGame.equals("SECONDGAME")) {
            System.out.println(Game.SECONDGAME);
        } else if (numberOfAGame.equals("THIRDGAME")){
            System.out.println(Game.THIRDGAME);
        } else {
            System.out.println("Please enter valid name!");
        }
    }
}
