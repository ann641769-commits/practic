package by.epam.learn.chapter8.b3.entity;

import java.util.ArrayList;

//класс Текст
public class Text {
    private ArrayList<Sentence> sentences = new ArrayList<>();

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }
}
