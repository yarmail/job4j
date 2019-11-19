package ru.job4j.coffeemachine;
import java.util.ArrayList;

/**
 * It is necessary to implement the method
 * of issuing change for the machine.
 * Задание Кофемашина. [#34741]
 * Надо реализовать метод выдачи сдачи для автомата.
 *
 * в автомате монеты номиналом 1 2 5 10
 * coin - возможные варианты для сдачи
 * price - стоимость кофе
 * money - деньги, купюры от пользователя
 * change - сдача
 *
 * changeMachine = механизм расчета
 *
 * @return result массив монет для сдачи, который получит пользователь
 */


public class CoffeeMachine {

    private final int[] coin = {10, 5, 2, 1};
    private int change = 0;
    private ArrayList<Integer> result = new ArrayList<>(0);

    public ArrayList<Integer> changeMachine(int money, int price) {
        if (price > money) {
            System.out.println("Недостаточно средств");
        }
        if (price == money) {
            System.out.println("Сдача не нужна");
        }
        if (price < money) {
        change = money - price;

        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == change) {
                result.add(coin[i]);
                break;
            }
            if (coin[i] < change) {
                result.add(coin[i]);
                change = change - coin[i];
                i--;
            }
        }
        }
        return result;
    }
}
