package by.epam.learn.chapter6.a3.entity;

//класс Ирис
public class Toffee extends Candy {
    private int milkPercent;  // содержание молока в процентах

    public Toffee(String name, String manufacturer, double price, int milkPercent) {
        super(name, manufacturer, price);
        this.milkPercent = milkPercent;
    }

    public int getMilkPercent() {
        return milkPercent;
    }

    @Override
    public String getType() {
        return "Ирис";
    }
}
