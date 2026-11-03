package by.epam.learn.chapter4.a3;

//класс Шасси
public class Chassis {
    private int wheelsCount;   // количество колес
    private boolean extended;  // выпущено ли шасси

    public Chassis(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        this.extended = true;
    }

    // убрать шасси: метод принадлежит шасси, потому что меняет его состояние
    public void retract() {
        extended = false;
        System.out.println("Шасси убрано.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Chassis chassis = (Chassis) o;
        return wheelsCount == chassis.wheelsCount;
    }

    @Override
    public int hashCode() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Chassis{wheelsCount=" + wheelsCount + ", extended=" + extended + "}";
    }
}
