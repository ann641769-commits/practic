package by.epam.learn.chapter3.c3;

public class ComplexPolynomial {
    // coefficients[i] - коэффициент при x в степени i
    private Complex[] coefficients;

    public ComplexPolynomial(Complex... coefficients) {
        this.coefficients = coefficients;
    }

    // сумма двух полиномов: складываем коэффициенты при одинаковых степенях
    public ComplexPolynomial add(ComplexPolynomial other) {
        int size = Math.max(coefficients.length, other.coefficients.length);
        Complex[] result = new Complex[size];
        for (int i = 0; i < size; i++) {
            // если у одного полинома степень меньше, его коэффициент равен нулю
            Complex first = i < coefficients.length ? coefficients[i] : new Complex(0, 0);
            Complex second = i < other.coefficients.length ? other.coefficients[i] : new Complex(0, 0);
            result[i] = first.add(second);
        }
        return new ComplexPolynomial(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coefficients.length - 1; i >= 0; i--) {
            sb.append(coefficients[i]);
            if (i >= 1) {
                sb.append("x");
            }
            if (i >= 2) {
                sb.append("^").append(i);
            }
            if (i > 0) {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }
}
