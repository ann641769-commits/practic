package by.epam.learn.chapter4.b3.entity;

//класс Чайник
public class Kettle extends Appliance {
    private double volume;  // объем в литрах

    public Kettle(String name, int power, double volume) {
        super(name, power);
        this.volume = volume;
    }

    @Override
    public String getType() {
        return "Чайник";
    }

    @Override
    public String toString() {
        return super.toString() + ", объем " + volume + " л";
    }
}
