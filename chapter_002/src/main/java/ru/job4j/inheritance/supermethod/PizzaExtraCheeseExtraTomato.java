package ru.job4j.inheritance.supermethod;

/**
 * 3 уровень
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    @Override
    public String name() {
       return super.name() + " + extra tomato";
    }
}