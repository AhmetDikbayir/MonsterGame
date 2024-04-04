package model;

import game.Game;

public class Player extends GameElement {

    private String playerName;
    private int age;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<10){
            throw new IllegalArgumentException("You cannot play this game!");
        }
        this.age = age;
    }


    public Player(String playerName, int age) {

        this.playerName = playerName;
        setAge(age);
    }
}
