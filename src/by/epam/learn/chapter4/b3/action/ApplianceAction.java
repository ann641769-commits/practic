package by.epam.learn.chapter4.b3.action;

import by.epam.learn.chapter4.b3.entity.Appliance;

//действия над электроприборами
public class ApplianceAction {

    // потребляемая мощность: складываем мощность только включенных приборов
    public int countPower(Appliance[] appliances) {
        int sum = 0;
        for (Appliance appliance : appliances) {
            if (appliance.isPluggedIn()) {
                sum += appliance.getPower();
            }
        }
        return sum;
    }

    // сортировка по мощности (по возрастанию), метод простого выбора
    public void sortByPower(Appliance[] appliances) {
        for (int i = 0; i < appliances.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < appliances.length; j++) {
                if (appliances[j].getPower() < appliances[minIndex].getPower()) {
                    minIndex = j;
                }
            }
            Appliance temp = appliances[i];
            appliances[i] = appliances[minIndex];
            appliances[minIndex] = temp;
        }
    }

    // поиск приборов, мощность которых лежит в диапазоне [min, max]
    public Appliance[] findByPower(Appliance[] appliances, int min, int max) {
        int count = 0;
        for (Appliance appliance : appliances) {
            if (appliance.getPower() >= min && appliance.getPower() <= max) {
                count++;
            }
        }
        Appliance[] result = new Appliance[count];
        int index = 0;
        for (Appliance appliance : appliances) {
            if (appliance.getPower() >= min && appliance.getPower() <= max) {
                result[index] = appliance;
                index++;
            }
        }
        return result;
    }
}
