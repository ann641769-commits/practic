package by.epam.learn.main;

public class Task2 {
    public static void main(String[] args) {
        // идем с последнего элемента массива к первому
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}