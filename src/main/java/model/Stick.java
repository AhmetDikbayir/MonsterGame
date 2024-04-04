package model;

public class Stick extends Tool {
    private int durability;

    public Stick(int power, int price, int durability) {
        super(power, price);
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
