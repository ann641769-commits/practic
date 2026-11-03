package by.epam.learn.chapter6.a3.advanced;

import by.epam.learn.chapter6.a3.entity.Candy;

//специализированные действия для конкретного вида сладостей
// параметризованный интерфейс: T - Candy или ее подкласс
public interface SpecialAction<T extends Candy> {
    void perform(T candy);
}
