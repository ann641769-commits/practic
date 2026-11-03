package by.epam.learn.main;

public class Task1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите имя в аргументах запуска");
        } else {
            System.out.println("Привет, " + args[0] + "!");  // args[0] - первый аргумент (имя)
        }
    }
}