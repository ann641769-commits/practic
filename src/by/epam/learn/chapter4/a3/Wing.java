package by.epam.learn.chapter4.a3;

//класс Крыло
public class Wing {
    private double span;  // размах крыла в метрах

    public Wing(double span) {
        this.span = span;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Wing wing = (Wing) o;
        return Double.compare(span, wing.span) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(span);
    }

    @Override
    public String toString() {
        return "Wing{span=" + span + "}";
    }
}
