package model;

public class Cannon extends Tool {
    private int numberOfCannonBalls;

    public Cannon(int power, int price, int numberOfCannonBalls) {
        super(power, price);
        this.numberOfCannonBalls = numberOfCannonBalls;
    }

    public int getNumberOfCannonBalls() {
        return numberOfCannonBalls;
    }

    public void setNumberOfCannonBalls(int numberOfCannonBalls) {
        this.numberOfCannonBalls = numberOfCannonBalls;
    }
}
