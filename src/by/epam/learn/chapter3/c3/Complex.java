package by.epam.learn.chapter3.c3;

public class Complex {
    private double re;  // действительная часть
    private double im;  // мнимая часть

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // сложение: складываем отдельно действительные и мнимые части
    public Complex add(Complex other) {
        return new Complex(re + other.re, im + other.im);
    }

    @Override
    public String toString() {
        return "(" + re + (im >= 0 ? " + " : " - ") + Math.abs(im) + "i)";
    }
}
