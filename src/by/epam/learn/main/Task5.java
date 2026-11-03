package by.epam.learn.main;

public class Task5 {
    public static void main(String[] args) {
        int sum = 0;      // сумма: начинаем с нуля
        long product = 1; // произведение: начинаем с единицы
        for (String str : args) {
            int number = Integer.parseInt(str); // строку превращаем в число
            sum += number;
            product *= number;
        }
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Произведение чисел = " + product);
    }
}