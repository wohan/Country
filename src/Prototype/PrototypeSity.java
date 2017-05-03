package Prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class PrototypeSity extends PrototypeArea {
    private int area;

    public PrototypeSity(String name, int peoples, int money, int area) {
        super(name, peoples, money);
        this.area = area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {

        return area;
    }

    public PrototypeSity clone() throws CloneNotSupportedException {
        return (PrototypeSity) super.clone();
    }
}
