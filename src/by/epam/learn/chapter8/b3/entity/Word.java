package by.epam.learn.chapter8.b3.entity;

//класс Слово
public class Word {
    private String value;

    public Word(String value) {
        this.value = value;
    }

    // слова сравниваем без учета регистра
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Word word = (Word) o;
        return value.equalsIgnoreCase(word.value);
    }

    @Override
    public int hashCode() {
        return value.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
