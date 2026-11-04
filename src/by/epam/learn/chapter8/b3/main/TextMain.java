package by.epam.learn.chapter8.b3.main;

import by.epam.learn.chapter8.b3.action.TextAction;
import by.epam.learn.chapter8.b3.action.TextParser;
import by.epam.learn.chapter8.b3.entity.Text;

//слово первого предложения, которого нет в остальных
public class TextMain {
    public static void main(String[] args) {
        // в тексте специально лишние пробелы и табуляция
        String source = "Мы  изучаем язык\tJava на лекциях.   Язык Java используется в разработке. "
                + "На лекциях мы пишем программы. Программы на Java работают на разных платформах.";

        Text text = new TextParser().parse(source);
        System.out.println("Слова первого предложения, которых нет в остальных: "
                + new TextAction().findUniqueWords(text));
    }
}
