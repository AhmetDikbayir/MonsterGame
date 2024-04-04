package model;

import game.Game;

public class GameElement {
    private int health;

    public GameElement(){
        setHealth(Game.FULL_HEALTH);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health>Game.FULL_HEALTH){
            throw new IllegalArgumentException("Health must be smaller than " + Game.FULL_HEALTH);
        }
        this.health = health;
    }

    public void resetHealth(){
        health = Game.FULL_HEALTH;
    }

    public void decreaseHealth(int attackPoint){
        health -= attackPoint;
    }

    public boolean isAlive(){
        return health>0;
    }
}
