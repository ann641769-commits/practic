package by.epam.learn.chapter4.b3.entity;

//класс Холодильник
public class Refrigerator extends Appliance {
    private int capacity;  // вместимость в литрах

    public Refrigerator(String name, int power, int capacity) {
        super(name, power);
        this.capacity = capacity;
    }

    @Override
    public String getType() {
        return "Холодильник";
    }

    @Override
    public String toString() {
        return super.toString() + ", вместимость " + capacity + " л";
    }
}
