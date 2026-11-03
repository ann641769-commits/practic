package by.epam.learn.chapter4.b3.entity;

//класс Компьютер
public class Computer extends Appliance {
    private String processor;

    public Computer(String name, int power, String processor) {
        super(name, power);
        this.processor = processor;
    }

    @Override
    public String getType() {
        return "Компьютер";
    }

    @Override
    public String toString() {
        return super.toString() + ", процессор " + processor;
    }
}
