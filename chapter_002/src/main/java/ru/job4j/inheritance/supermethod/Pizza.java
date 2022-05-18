package ru.job4j.inheritance.supermethod;

/**
 * 5. Вызов переопределенного метода родителя - super.method ... [#504871]
 *
 * Задание
 * Вам нужно создать наследников
 * PizzaExtraCheese -> PizzaExtraCheesaExtraTomato.
 * В наследниках переопределить метод name().
 * Метод name() должен получить имя пиццы
 * родителя и добавить свой топпинг: сыр и томаты.
 */
public class Pizza {
    public String name() {
        return "Just tasty pizza";
    }
}
