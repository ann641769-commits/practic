package by.epam.learn.chapter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskA3 {

    //Вводим n чисел, считаем среднюю длину и выводим числа короче и длиннее средней.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел n и нажмите <Enter>:");
        int n = scan.nextInt();

        // каждое число хранится как массив символов
        char[][] numbers = new char[n][];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.next().toCharArray();
        }
        scan.close();

        // средняя длина чисел
        int sum = 0;
        for (char[] number : numbers) {
            sum += number.length;
        }
        double average = (double) sum / n;
        System.out.println("Средняя длина чисел: " + average);

        System.out.println("Числа, длина которых меньше средней:");
        for (char[] number : numbers) {
            if (number.length < average) {
                System.out.println(String.valueOf(number) + " (длина " + number.length + ")");
            }
        }

        System.out.println("Числа, длина которых больше средней:");
        for (char[] number : numbers) {
            if (number.length > average) {
                System.out.println(String.valueOf(number) + " (длина " + number.length + ")");
            }
        }

        // внизу фамилия разработчика, дата и время получения и сдачи задания
        String developer = "Тугутова";
        String received = "29.10.2026 17:00";
        String submitted = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        System.out.println("Разработчик: " + developer);
        System.out.println("Задание получено: " + received);
        System.out.println("Задание сдано: " + submitted);
    }
}
