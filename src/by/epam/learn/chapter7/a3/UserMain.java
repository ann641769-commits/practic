package by.epam.learn.chapter7.a3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//сортировка, выбор и группировка пользователей
public class UserMain {
    public static void main(String[] args) {
        User[] users = {
                new User(1, "Анна", 25, "Беларусь"),
                new User(2, "Андрей", 30, "Россия"),
                new User(3, "Борис", 41, "Польша"),
                new User(4, "Алексей", 25, "Польша"),
                new User(5, "Виктор", 19, "Беларусь"),
                new User(6, "Александр", 40, "Россия"),
                new User(7, "Алина", 19, "Беларусь"),
                new User(8, "Артем", 22, "Беларусь"),
                new User(9, "Светлана", 35, "Россия")
        };

        // сортировка по стране, а при одинаковой стране - по возрасту
        Arrays.sort(users, Comparator.comparing(User::getCountry).thenComparing(User::getAge));
        System.out.println("Отсортированные пользователи:");
        for (User user : users) {
            System.out.println(user);
        }

        // выбор пользователей старше заданного возраста, имя которых начинается с заданной буквы
        int minAge = 20;
        char letter = 'А';
        Predicate<User> olderThan = user -> user.getAge() > minAge;
        Predicate<User> startsWith = user -> user.getName().charAt(0) == letter;
        List<User> selected = Arrays.stream(users)
                .filter(olderThan.and(startsWith))
                .collect(Collectors.toList());
        System.out.println("Выбранные пользователи:");
        for (User user : selected) {
            System.out.println(user);
        }

        // группировка по возрасту, минимальный и максимальный возраст
        Map<Integer, List<User>> byAge = selected.stream()
                .collect(Collectors.groupingBy(User::getAge));
        int minGroup = Collections.min(byAge.keySet());
        int maxGroup = Collections.max(byAge.keySet());
        System.out.println("Минимальный возраст " + minGroup + ":");
        for (User user : byAge.get(minGroup)) {
            System.out.println(user);
        }
        System.out.println("Максимальный возраст " + maxGroup + ":");
        for (User user : byAge.get(maxGroup)) {
            System.out.println(user);
        }
    }
}
