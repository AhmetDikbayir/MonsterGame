package model;

public class Catapult extends Tool {
    private int numberOfRocks;

    public Catapult(int power, int price, int numberOfRocks) {
        super(power, price);
        this.numberOfRocks = numberOfRocks;
    }

    public int getNumberOfRocks() {
        return numberOfRocks;
    }

    public void setNumberOfRocks(int numberOfRocks) {
        this.numberOfRocks = numberOfRocks;
    }
}
