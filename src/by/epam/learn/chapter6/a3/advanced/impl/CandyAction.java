package by.epam.learn.chapter6.a3.advanced.impl;

import by.epam.learn.chapter6.a3.advanced.SpecialAction;
import by.epam.learn.chapter6.a3.entity.Candy;

//специальное действие для конфеты
public class CandyAction implements SpecialAction<Candy> {
    @Override
    public void perform(Candy candy) {
        System.out.println("Конфета \"" + candy.getName() + "\" завернута в фантик.");
    }
}
