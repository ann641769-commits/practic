package by.epam.learn.main;

public class Task4 {
    public static void main(String[] args) {
        String sample = "qwerty"; // строка-образец
        if (args.length == 0) {
            System.out.println("Пароль не введен.");
        } else if (sample.equals(args[0])) {
            // строки сравниваем через equals, а не через ==
            System.out.println("Пароль верный.");
        } else {
            System.out.println("Пароль неверный.");
        }
    }
}