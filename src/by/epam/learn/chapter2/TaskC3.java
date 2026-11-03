package by.epam.learn.chapter2;

import java.util.Random;
import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность матрицы n:");
        int n = scan.nextInt();
        scan.close();

        // матрица со случайными значениями от -n до n
        int[][] a = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2 * n + 1) - n;
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // элементы читаем по строкам, как одну последовательность
        int[] line = new int[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                line[index] = a[i][j];
                index++;
            }
        }

        int maxUp = 1;
        int maxDown = 1;
        int currentUp = 1;
        int currentDown = 1;
        for (int i = 1; i < line.length; i++) {
            if (line[i] > line[i - 1]) {
                currentUp++;
            } else {
                currentUp = 1;
            }
            if (line[i] < line[i - 1]) {
                currentDown++;
            } else {
                currentDown = 1;
            }
            if (currentUp > maxUp) {
                maxUp = currentUp;
            }
            if (currentDown > maxDown) {
                maxDown = currentDown;
            }
        }
        System.out.println("Наибольшее число возрастающих элементов подряд: " + maxUp);
        System.out.println("Наибольшее число убывающих элементов подряд: " + maxDown);
    }
}
