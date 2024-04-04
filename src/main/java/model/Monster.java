package model;

import game.Game;

public class Monster extends GameElement{

    private String monsterType;
    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public Monster(String monsterType) {

        this.monsterType = monsterType;
    }
}
