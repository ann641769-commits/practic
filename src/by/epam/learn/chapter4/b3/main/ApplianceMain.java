package by.epam.learn.chapter4.b3.main;

import by.epam.learn.chapter4.b3.action.ApplianceAction;
import by.epam.learn.chapter4.b3.entity.Appliance;
import by.epam.learn.chapter4.b3.entity.Computer;
import by.epam.learn.chapter4.b3.entity.Kettle;
import by.epam.learn.chapter4.b3.entity.Lamp;
import by.epam.learn.chapter4.b3.entity.Refrigerator;

import java.util.Scanner;

//электроприборы квартиры, консольное меню
public class ApplianceMain {

    private static void printAppliances(Appliance[] appliances) {
        for (int i = 0; i < appliances.length; i++) {
            System.out.println((i + 1) + ". " + appliances[i]);
        }
    }

    public static void main(String[] args) {
        Appliance[] appliances = {
                new Lamp("Настольная лампа", 40, 450),
                new Kettle("Чайник", 2000, 1.7),
                new Refrigerator("Холодильник", 150, 280),
                new Computer("Ноутбук", 65, "Intel Core i5"),
                new Lamp("Люстра", 180, 2500),
                new Computer("Системный блок", 450, "AMD Ryzen 5")
        };

        ApplianceAction action = new ApplianceAction();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("1 - показать приборы");
            System.out.println("2 - включить прибор в розетку");
            System.out.println("3 - потребляемая мощность");
            System.out.println("4 - сортировка по мощности");
            System.out.println("5 - поиск по диапазону мощности");
            System.out.println("0 - выход");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    printAppliances(appliances);
                    break;
                case 2:
                    printAppliances(appliances);
                    System.out.println("Номер прибора:");
                    appliances[scan.nextInt() - 1].setPluggedIn(true);
                    break;
                case 3:
                    System.out.println("Потребляемая мощность: " + action.countPower(appliances) + " Вт");
                    break;
                case 4:
                    action.sortByPower(appliances);
                    printAppliances(appliances);
                    break;
                case 5:
                    System.out.println("Минимальная мощность:");
                    int min = scan.nextInt();
                    System.out.println("Максимальная мощность:");
                    int max = scan.nextInt();
                    printAppliances(action.findByPower(appliances, min, max));
                    break;
            }
        } while (choice != 0);

        scan.close();
    }
}
