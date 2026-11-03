package by.epam.learn.main;

import java.util.Scanner;

public class VariantB3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел n и нажмите <Enter>:");
        int n = scan.nextInt();

        System.out.println("Введите " + n + " целых чисел:");
        int[] numbers = new int[n]; // массив для хранения введенных чисел
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int number : numbers) {
            // остаток от деления равен 0, значит число делится нацело
            if (number % 3 == 0 || number % 9 == 0) {
                System.out.println(number);
            }
        }
    }
}