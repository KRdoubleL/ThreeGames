package org.berlin.threegames;

public enum Game {
    FIRSTGAME{
        @Override
        public String toString() {
            return "Game one is starting";
        }
    },
    SECONDGAME{
        @Override
        public String toString() {
            return "Game two is starting";
        }
    },
    THIRDGAME{
        @Override
        public String toString() {
            return "Game three is starting";
        }
    };
}
