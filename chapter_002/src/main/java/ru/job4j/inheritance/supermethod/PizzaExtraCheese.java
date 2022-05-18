package ru.job4j.inheritance.supermethod;

/**
 * 2 уровень
 */
public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return super.name() + " + extra cheese";
    }
}
