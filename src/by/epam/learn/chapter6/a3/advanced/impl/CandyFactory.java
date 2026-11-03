package by.epam.learn.chapter6.a3.advanced.impl;

import by.epam.learn.chapter6.a3.advanced.CandyManagement;
import by.epam.learn.chapter6.a3.entity.Candy;

import java.util.ArrayList;

//реализация общего управления: кондитерская фабрика
public class CandyFactory implements CandyManagement {
    private ArrayList<Candy> catalog = new ArrayList<>();

    // ищет конфету по названию
    private Candy find(String name) {
        for (Candy candy : catalog) {
            if (candy.getName().equals(name)) {
                return candy;
            }
        }
        return null;
    }

    @Override
    public boolean releaseBatch(String name, int count) {
        Candy candy = find(name);
        if (candy == null || !candy.isInProduction()) {
            return false;
        }
        candy.setProducedCount(candy.getProducedCount() + count);
        return true;
    }

    @Override
    public ArrayList<Candy> getByManufacturer(String manufacturer) {
        ArrayList<Candy> result = new ArrayList<>();
        for (Candy candy : catalog) {
            if (candy.getManufacturer().equals(manufacturer)) {
                result.add(candy);
            }
        }
        return result;
    }

    @Override
    public void addProduct(Candy candy) {
        catalog.add(candy);
    }

    @Override
    public boolean editProduct(String name, String newManufacturer, double newPrice) {
        Candy candy = find(name);
        if (candy == null) {
            return false;
        }
        candy.setManufacturer(newManufacturer);
        candy.setPrice(newPrice);
        return true;
    }

    @Override
    public boolean addIngredient(String name, String ingredient) {
        Candy candy = find(name);
        if (candy == null) {
            return false;
        }
        candy.getIngredients().add(ingredient);
        return true;
    }

    @Override
    public Candy createNewType(String name, String manufacturer, double price) {
        Candy candy = new Candy(name, manufacturer, price);
        catalog.add(candy);
        return candy;
    }

    @Override
    public boolean removeFromProduction(String name) {
        Candy candy = find(name);
        if (candy == null) {
            return false;
        }
        candy.setInProduction(false);
        return true;
    }
}
