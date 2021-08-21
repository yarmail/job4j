package ru.job4j.condition;

/**
 * 4.3.2. Оператор || [#333784]
 *Если одна из переменных - "истина", то все выражение - "истина".
 *
 * Ниже приведен код класса Club. Метод permission выводит на консоль, можем мы пройти в клуб или нет.
 * Правила пропуска: или у посетителя есть деньги,
 * или посетитель - наш друг.
 */

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}