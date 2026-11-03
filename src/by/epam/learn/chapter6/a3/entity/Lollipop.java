package by.epam.learn.chapter6.a3.entity;

//класс Леденец
public class Lollipop extends Candy {
    private boolean hasStick;  // есть ли палочка

    public Lollipop(String name, String manufacturer, double price, boolean hasStick) {
        super(name, manufacturer, price);
        this.hasStick = hasStick;
    }

    public boolean isHasStick() {
        return hasStick;
    }

    public void setHasStick(boolean hasStick) {
        this.hasStick = hasStick;
    }

    @Override
    public String getType() {
        return "Леденец";
    }
}
