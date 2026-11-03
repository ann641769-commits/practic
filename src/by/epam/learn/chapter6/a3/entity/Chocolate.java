package by.epam.learn.chapter6.a3.entity;

//класс Шоколад
public class Chocolate extends Candy {
    private int cocoaPercent;  // содержание какао в процентах

    public Chocolate(String name, String manufacturer, double price, int cocoaPercent) {
        super(name, manufacturer, price);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() {
        return cocoaPercent;
    }

    @Override
    public String getType() {
        return "Шоколад";
    }
}
