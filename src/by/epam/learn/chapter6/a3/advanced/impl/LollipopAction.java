package by.epam.learn.chapter6.a3.advanced.impl;

import by.epam.learn.chapter6.a3.advanced.SpecialAction;
import by.epam.learn.chapter6.a3.entity.Lollipop;

//специальное действие для леденца
public class LollipopAction implements SpecialAction<Lollipop> {
    @Override
    public void perform(Lollipop lollipop) {
        lollipop.setHasStick(true);
        System.out.println("Леденец \"" + lollipop.getName() + "\": вставлена палочка.");
    }
}
