package by.epam.learn.chapter6.a3.advanced;

import by.epam.learn.chapter6.a3.entity.Candy;

import java.util.ArrayList;

// общее управление производством конфет
public interface CandyManagement {
    // выпустить партию конфет
    boolean releaseBatch(String name, int count);

    // информация по продукции определенного производителя
    ArrayList<Candy> getByManufacturer(String manufacturer);

    // добавить информацию о продукции
    void addProduct(Candy candy);

    // редактировать информацию о продукции
    boolean editProduct(String name, String newManufacturer, double newPrice);

    // добавить новый ингредиент
    boolean addIngredient(String name, String ingredient);

    // создать новый тип конфет
    Candy createNewType(String name, String manufacturer, double price);

    // снять с производства определенный тип конфет
    boolean removeFromProduction(String name);
}
