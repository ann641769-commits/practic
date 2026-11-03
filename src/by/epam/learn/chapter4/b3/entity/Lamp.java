package by.epam.learn.chapter4.b3.entity;

//класс Лампа
public class Lamp extends Appliance {
    private int brightness;  // яркость в люменах

    public Lamp(String name, int power, int brightness) {
        super(name, power);
        this.brightness = brightness;
    }

    @Override
    public String getType() {
        return "Лампа";
    }

    @Override
    public String toString() {
        return super.toString() + ", яркость " + brightness + " лм";
    }
}
