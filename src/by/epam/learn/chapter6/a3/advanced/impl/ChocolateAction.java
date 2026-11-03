package by.epam.learn.chapter6.a3.advanced.impl;

import by.epam.learn.chapter6.a3.advanced.SpecialAction;
import by.epam.learn.chapter6.a3.entity.Chocolate;

//специальное действие для шоколада
public class ChocolateAction implements SpecialAction<Chocolate> {
    @Override
    public void perform(Chocolate chocolate) {
        System.out.println("Шоколад \"" + chocolate.getName() + "\" закален, какао "
                + chocolate.getCocoaPercent() + "%.");
    }
}
