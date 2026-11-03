package by.epam.learn.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6 {
    public static void main(String[] args) {
        String developer = "Тугутова";                // фамилия
        String received = "29.10.2026 17:00";       // когда получено задание
        // текущие дата и время берем у компьютера и задаем формат вывода
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String submitted = LocalDateTime.now().format(format);

        System.out.println("Разработчик: " + developer);
        System.out.println("Задание получено: " + received);
        System.out.println("Задание сдано: " + submitted);
    }
}