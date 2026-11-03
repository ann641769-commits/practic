package by.epam.learn.chapter2;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = scan.nextInt();
        System.out.println("Введите m:");
        int m = scan.nextInt();
        System.out.println("Введите k:");
        int k = scan.nextInt();
        scan.close();

        // круглая скобка - граница не входит, квадратная - входит
        System.out.println("(" + n + ", " + m + "): " + (k > n && k < m));
        System.out.println("[" + n + ", " + m + "): " + (k >= n && k < m));
        System.out.println("(" + n + ", " + m + "]: " + (k > n && k <= m));
        System.out.println("[" + n + ", " + m + "]: " + (k >= n && k <= m));
    }
}
