package ru.job4j.inheritance.supermethod;

/**
 * 2 уровень наследования.
 * К мороженнному добавляем варенье
 * добавленная стоимость варенья - 50
 *
 */
public class IceCreamPlusJam extends IceCream {
    private static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }
}