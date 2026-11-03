package by.epam.learn.chapter4.a3;

// Наследование не используется: самолет не является крылом или двигателем,
// он их содержит (отношение "имеет"), поэтому они сделаны полями класса.
public class Airplane {
    private String brand;  // марка самолета
    private Wing wing;
    private Chassis chassis;
    private Engine engine;
    private String route;  // маршрут

    public Airplane(String brand, Wing wing, Chassis chassis, Engine engine) {
        this.brand = brand;
        this.wing = wing;
        this.chassis = chassis;
        this.engine = engine;
    }

    // маршрут относится ко всему самолету, поэтому метод здесь
    public void setRoute(String from, String to) {
        route = from + " - " + to;
        System.out.println("Маршрут задан: " + route);
    }

    // летит самолет целиком, поэтому метод здесь
    public void fly() {
        engine.start();
        chassis.retract();
        System.out.println("Самолет " + brand + " летит по маршруту " + route + ".");
    }

    public void printBrand() {
        System.out.println("Марка самолета: " + brand);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Airplane airplane = (Airplane) o;
        if (brand != null ? !brand.equals(airplane.brand) : airplane.brand != null) {
            return false;
        }
        if (wing != null ? !wing.equals(airplane.wing) : airplane.wing != null) {
            return false;
        }
        if (chassis != null ? !chassis.equals(airplane.chassis) : airplane.chassis != null) {
            return false;
        }
        return engine != null ? engine.equals(airplane.engine) : airplane.engine == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (wing != null ? wing.hashCode() : 0);
        result = 31 * result + (chassis != null ? chassis.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airplane{brand='" + brand + "', wing=" + wing + ", chassis=" + chassis
                + ", engine=" + engine + ", route='" + route + "'}";
    }
}
