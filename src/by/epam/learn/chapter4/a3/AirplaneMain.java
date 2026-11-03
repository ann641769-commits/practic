package by.epam.learn.chapter4.a3;

//создание объекта Самолет и вызов его методов
public class AirplaneMain {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 737", new Wing(35.8), new Chassis(6), new Engine("CFM56", 120));

        airplane.printBrand();
        airplane.setRoute("Улан-удэ", "Москва");
        airplane.fly();
    }
}
