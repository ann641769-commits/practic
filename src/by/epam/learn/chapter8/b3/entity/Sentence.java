package by.epam.learn.chapter8.b3.entity;

import java.util.ArrayList;

//класс Предложение
public class Sentence {
    private ArrayList<Word> words = new ArrayList<>();

    public ArrayList<Word> getWords() {
        return words;
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public boolean contains(Word word) {
        return words.contains(word);
    }
}
