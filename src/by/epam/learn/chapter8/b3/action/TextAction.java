package by.epam.learn.chapter8.b3.action;

import by.epam.learn.chapter8.b3.entity.Sentence;
import by.epam.learn.chapter8.b3.entity.Text;
import by.epam.learn.chapter8.b3.entity.Word;

import java.util.ArrayList;

//действия над текстом
public class TextAction {

    // слова первого предложения, которых нет ни в одном из остальных предложений
    public ArrayList<Word> findUniqueWords(Text text) {
        ArrayList<Word> result = new ArrayList<>();
        Sentence first = text.getSentences().get(0);
        for (Word word : first.getWords()) {
            boolean foundInOthers = false;
            for (int i = 1; i < text.getSentences().size(); i++) {
                if (text.getSentences().get(i).contains(word)) {
                    foundInOthers = true;
                }
            }
            if (!foundInOthers && !result.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }
}
