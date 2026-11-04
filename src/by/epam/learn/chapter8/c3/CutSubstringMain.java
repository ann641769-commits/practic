package by.epam.learn.chapter8.c3;

//удаление самой длинной подстроки, у которой первый и последний символ одинаковы
public class CutSubstringMain {
    public static void main(String[] args) {
        String text = "Мама мыла раму.";
        System.out.println(text);

        int bestStart = 0;
        int bestEnd = 0;
        int bestLength = 0;

        // перебираем все пары позиций (i, j), берем только буквы
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i))) {
                continue;
            }
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j) && j - i + 1 > bestLength) {
                    bestLength = j - i + 1;
                    bestStart = i;
                    bestEnd = j;
                }
            }
        }

        if (bestLength == 0) {
            System.out.println("Подходящей подстроки нет.");
        } else {
            System.out.println(text.substring(0, bestStart) + text.substring(bestEnd + 1));
        }
    }
}
