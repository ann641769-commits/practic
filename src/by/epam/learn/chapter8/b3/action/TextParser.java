package by.epam.learn.chapter8.b3.action;

import by.epam.learn.chapter8.b3.entity.Sentence;
import by.epam.learn.chapter8.b3.entity.Text;
import by.epam.learn.chapter8.b3.entity.Word;

//разбор текста на предложения и слова
public class TextParser {

    public Text parse(String source) {
        // табуляции и последовательности пробелов заменяем одним пробелом
        String normalized = source.replaceAll("[ \\t]+", " ").trim();

        Text text = new Text();
        StringBuilder current = new StringBuilder();
        for (char ch : normalized.toCharArray()) {
            current.append(ch);
            // предложение заканчивается точкой, вопросительным или восклицательным знаком
            if (ch == '.' || ch == '!' || ch == '?') {
                text.addSentence(parseSentence(current.toString()));
                current.setLength(0);
            }
        }
        // последнее предложение может быть без знака в конце
        if (!current.toString().trim().isEmpty()) {
            text.addSentence(parseSentence(current.toString()));
        }
        return text;
    }

    // делим предложение на слова: разделитель - любой символ, кроме букв
    private Sentence parseSentence(String source) {
        Sentence sentence = new Sentence();
        for (String part : source.split("[^а-яА-ЯёЁa-zA-Z]+")) {
            if (!part.isEmpty()) {
                sentence.addWord(new Word(part));
            }
        }
        return sentence;
    }
}
