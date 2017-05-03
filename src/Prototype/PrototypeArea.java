package Prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class PrototypeArea extends PrototypeHouse {

    private int money;

    public PrototypeArea(String name, int peoples, int money) {
        super(name, peoples);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public PrototypeArea clone() throws CloneNotSupportedException {
        return (PrototypeArea) super.clone();
    }
}
