package by.epam.learn.chapter3.b3;

public class EquationMain {
    public static void main(String[] args) {
        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, 2, 5),
                new QuadraticEquation(2, -4, 2),
                new QuadraticEquation(-1, 0, 4),
                new QuadraticEquation(1, -6, 5)
        };

        double maxRoot = Double.NEGATIVE_INFINITY;
        double minRoot = Double.POSITIVE_INFINITY;

        for (QuadraticEquation equation : equations) {
            System.out.println("Уравнение: " + equation);

            double[] roots = equation.findRoots();
            if (roots.length == 0) {
                System.out.println("Корней нет");
            } else {
                System.out.print("Корни:");
                for (double root : roots) {
                    System.out.print(" " + root);
                    if (root > maxRoot) {
                        maxRoot = root;
                    }
                    if (root < minRoot) {
                        minRoot = root;
                    }
                }
                System.out.println();
            }

            double[] extremum = equation.findExtremum();
            System.out.println("Экстремум: x = " + extremum[0] + ", y = " + extremum[1]);
            System.out.println("Функция " + equation.findIntervals());
        }

        System.out.println("Наибольший корень: " + maxRoot);
        System.out.println("Наименьший корень: " + minRoot);
    }
}
