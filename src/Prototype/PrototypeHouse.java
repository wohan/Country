package Prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class PrototypeHouse implements Cloneable {
    private String name;
    private int peoples;

    public PrototypeHouse(String name, int peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public String getName() {

        return name;
    }

    public int getPeoples() {
        return peoples;
    }

    public PrototypeHouse clone() throws CloneNotSupportedException {
        return (PrototypeHouse) super.clone();
    }
}
