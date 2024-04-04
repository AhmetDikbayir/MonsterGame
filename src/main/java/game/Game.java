package game;

import model.Monster;
import model.Player;
import model.Stick;

import java.util.Scanner;

public class Game {
    public  static final int  FULL_HEALTH = 100;
    private Player player;
    private Monster monster;



    Scanner input = new Scanner(System.in);
    public void startGame(){

        buildMonster();
        buildPlayer();
        do{
            startAttacks();
            resetHealths();
        }while(shouldContinue());
    }

    private void startAttacks() {
        while(player.isAlive() && monster.isAlive()){
            System.out.println("Player " + player.getPlayerName() + " attacked!");
            monster.decreaseHealth(getAttackPoint());
            if(!monster.isAlive()){
                printHealthStatus();
                break;
            }
            System.out.println("Monster " + monster.getMonsterType() + " attacked!");
            player.decreaseHealth(getAttackPoint());
            printHealthStatus();
        }
        System.out.println(((player.isAlive()) ? "Player " : "Monster ") + "WIN!!");
    }

    private void printHealthStatus() {
        System.out.println("Monster health is: " + monster.getHealth());
        System.out.println("Player " + player.getPlayerName() + " health is: " + player.getHealth());
    }

    private void resetHealths() {
        player.resetHealth();
        monster.resetHealth();
    }

    private void buildPlayer(){
        String name = askName();
        int age = askAge();
        player = new Player(name, age);

    }

    private void buildMonster(){
        monster = new Monster("Big head");
    }
    public static int getAttackPoint(){
        return (int) (1 + Math.random()*10);
    }
    private String askName(){
        System.out.println("Please enter your name:");
        return input.nextLine();
    }
    private int askAge(){
        System.out.println("Please enter your age:");
        return input.nextInt();
    }

    private boolean shouldContinue(){
        System.out.println("Do you want to play again?\n" +
                "Press 1 ==> YES\n" +
                "Press 2 ==> NO");
        int answer = input.nextInt();
        return answer ==1;
    }
}
