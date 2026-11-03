package by.epam.learn.chapter4.a3;

//класс Двигатель
public class Engine {
    private String model;
    private int power;        // мощность в киловаттах
    private boolean running;  // работает ли двигатель

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    // запуск двигателя: метод принадлежит двигателю
    public void start() {
        running = true;
        System.out.println("Двигатель " + model + " запущен.");
    }

    // двигатели равны, если одинаковы модель и мощность
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Engine engine = (Engine) o;
        if (power != engine.power) {
            return false;
        }
        return model != null ? model.equals(engine.model) : engine.model == null;
    }

    @Override
    public int hashCode() {
        return power + 31 * (model != null ? model.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "Engine{model='" + model + "', power=" + power + ", running=" + running + "}";
    }
}
