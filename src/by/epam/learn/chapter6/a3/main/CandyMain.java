package by.epam.learn.chapter6.a3.main;

import by.epam.learn.chapter6.a3.advanced.CandyManagement;
import by.epam.learn.chapter6.a3.advanced.impl.CandyAction;
import by.epam.learn.chapter6.a3.advanced.impl.CandyFactory;
import by.epam.learn.chapter6.a3.advanced.impl.ChocolateAction;
import by.epam.learn.chapter6.a3.advanced.impl.LollipopAction;
import by.epam.learn.chapter6.a3.advanced.impl.ToffeeAction;
import by.epam.learn.chapter6.a3.entity.Candy;
import by.epam.learn.chapter6.a3.entity.Chocolate;
import by.epam.learn.chapter6.a3.entity.Lollipop;
import by.epam.learn.chapter6.a3.entity.Toffee;

//управление производством конфет
public class CandyMain {
    public static void main(String[] args) {
        CandyManagement factory = new CandyFactory();

        Candy candy = new Candy("Белочка", "Коммунарка", 0.5);
        Chocolate chocolate = new Chocolate("Темный шоколад", "Коммунарка", 3.2, 70);
        Lollipop lollipop = new Lollipop("Петушок", "Красный пищевик", 0.3, false);
        Toffee toffee = new Toffee("Золотой ключик", "Красный пищевик", 0.4, 15);
        factory.addProduct(candy);
        factory.addProduct(chocolate);
        factory.addProduct(lollipop);
        factory.addProduct(toffee);

        factory.releaseBatch("Белочка", 1000);
        factory.addIngredient("Белочка", "орехи");
        factory.editProduct("Белочка", "Спартак", 0.6);
        factory.createNewType("Ромашка", "Спартак", 0.45);

        System.out.println("Продукция производителя Спартак:");
        for (Candy item : factory.getByManufacturer("Спартак")) {
            System.out.println(item);
        }

        System.out.println("Продукция производителя Красный пищевик:");
        for (Candy item : factory.getByManufacturer("Красный пищевик")) {
            System.out.println(item);
        }

        factory.removeFromProduction("Петушок");
        System.out.println("Выпуск партии Петушка после снятия с производства: "
                + factory.releaseBatch("Петушок", 100));

        // специализированные методы для каждого вида
        new CandyAction().perform(candy);
        new ChocolateAction().perform(chocolate);
        new LollipopAction().perform(lollipop);
        new ToffeeAction().perform(toffee);
    }
}
