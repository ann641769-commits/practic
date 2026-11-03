package by.epam.learn.chapter4.b3.entity;

//базовый класс Электроприбор
public abstract class Appliance {
    private String name;
    private int power;          // мощность в ваттах
    private boolean pluggedIn;  // включен ли в розетку

    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    // у каждого вида прибора свое название вида (полиморфизм)
    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " \"" + name + "\", мощность " + power + " Вт, "
                + (pluggedIn ? "включен в розетку" : "не включен");
    }
}
