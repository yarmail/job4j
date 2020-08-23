package ru.job4j.predicateexample;

import java.util.function.Predicate;

/**
 * Использование предиката для проверки
 * Использована хитрая перегрузка и подстановка
 */
public class ExampleA {

    /**
     * Проверяем, что число положительное
     */
    public static boolean checkPositive(int num) {
        return checkPositive(x -> x > 0, num);
    }

    private static boolean checkPositive(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

///////////////////////////////////

    /**
     * Проверяем что четное
     */
    public static boolean checkEven(int num) {
        return checkEven(x -> x % 2 == 0, num);
    }

    private static boolean checkEven(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

    // при совмещении обоих условий получится выражение
    // return check(x -> x > 0 && x % 2 == 0, num);
}
