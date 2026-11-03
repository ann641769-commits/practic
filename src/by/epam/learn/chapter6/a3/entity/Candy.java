package by.epam.learn.chapter6.a3.entity;

import java.util.ArrayList;

//базовый класс Конфета
public class Candy {
    private String name;
    private String manufacturer;
    private double price;
    private boolean inProduction = true;  // выпускается ли сейчас
    private int producedCount;            // сколько штук выпущено
    private ArrayList<String> ingredients = new ArrayList<>();

    public Candy(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

    public int getProducedCount() {
        return producedCount;
    }

    public void setProducedCount(int producedCount) {
        this.producedCount = producedCount;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    // название вида сладости, в подклассах переопределяется
    public String getType() {
        return "Конфета";
    }

    @Override
    public String toString() {
        return getType() + " \"" + name + "\", производитель: " + manufacturer + ", цена: " + price
                + ", ингредиенты: " + (ingredients.isEmpty() ? "нет" : ingredients)
                + ", выпускается: " + (inProduction ? "да" : "нет") + ", выпущено: " + producedCount;
    }
}
