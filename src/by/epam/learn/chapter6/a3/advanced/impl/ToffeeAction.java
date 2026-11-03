package by.epam.learn.chapter6.a3.advanced.impl;

import by.epam.learn.chapter6.a3.advanced.SpecialAction;
import by.epam.learn.chapter6.a3.entity.Toffee;

//специальное действие для ириса
public class ToffeeAction implements SpecialAction<Toffee> {
    @Override
    public void perform(Toffee toffee) {
        System.out.println("Ирис \"" + toffee.getName() + "\": сварена масса, молока "
                + toffee.getMilkPercent() + "%.");
    }
}
