package by.epam.learn.main;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // количество чисел приходит строкой, переводим его в int
        int count = Integer.parseInt(args[0]);
        Random random = new Random();
        System.out.println("С новой строки после каждого числа:");
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt(100)); // println - с переходом
        }
        System.out.println("Без перехода на новую строку:");
        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt(100) + " "); // print - без перехода
        }
        System.out.println();
    }
}