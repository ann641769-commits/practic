package by.epam.learn.chapter3.b3;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // поиск корней: возвращает массив из 0, 1 или 2 корней
    public double[] findRoots() {
        double d = b * b - 4 * a * c;  // дискриминант
        if (d < 0) {
            return new double[0];
        } else if (d == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            return new double[]{(-b - Math.sqrt(d)) / (2 * a), (-b + Math.sqrt(d)) / (2 * a)};
        }
    }

    // экстремум - вершина параболы, возвращаем пару {x, y}
    public double[] findExtremum() {
        double x = -b / (2 * a);
        return new double[]{x, a * x * x + b * x + c};
    }

    // интервалы убывания и возрастания
    public String findIntervals() {
        double x0 = -b / (2 * a);
        if (a > 0) {
            return "убывает на (-бесконечность; " + x0 + "], возрастает на [" + x0 + "; +бесконечность)";
        } else {
            return "возрастает на (-бесконечность; " + x0 + "], убывает на [" + x0 + "; +бесконечность)";
        }
    }

    @Override
    public String toString() {
        return a + "x^2 + (" + b + ")x + (" + c + ") = 0";
    }
}
