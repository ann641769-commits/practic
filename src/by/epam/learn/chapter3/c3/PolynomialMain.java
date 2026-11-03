package by.epam.learn.chapter3.c3;

public class PolynomialMain {
    public static void main(String[] args) {
        // коэффициенты записаны от свободного члена к старшему
        ComplexPolynomial[] polynomials = {
                new ComplexPolynomial(new Complex(1, 2), new Complex(3, -1)),
                new ComplexPolynomial(new Complex(0, 1), new Complex(2, 2), new Complex(4, 0)),
                new ComplexPolynomial(new Complex(-1, 0), new Complex(1, 1), new Complex(0, -3), new Complex(5, 5))
        };

        // сумма всех полиномов массива, начинаем с нулевого полинома
        ComplexPolynomial sum = new ComplexPolynomial(new Complex(0, 0));
        for (ComplexPolynomial polynomial : polynomials) {
            System.out.println(polynomial);
            sum = sum.add(polynomial);
        }
        System.out.println("Сумма: " + sum);
    }
}
