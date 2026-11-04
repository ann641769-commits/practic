package by.epam.learn.chapter8.a3;

//исправление: после буквы Р вместо О напечатана буква А
public class FixTextMain {

    // если после буквы р (или Р) стоит а (или А), заменяем ее на о (или О)
    public static String fix(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 1; i < sb.length(); i++) {
            char previous = sb.charAt(i - 1);
            char current = sb.charAt(i);
            if (previous == 'р' || previous == 'Р') {
                if (current == 'а') {
                    sb.setCharAt(i, 'о');
                } else if (current == 'А') {
                    sb.setCharAt(i, 'О');
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "Тропинка пратянулась мимо пруда. Прахожие шли медленно, а дома их ждал обед. "
                + "На столе лежал теплый прамокший плащ.";
        System.out.println(text);
        System.out.println(fix(text));
    }
}
