package ru.job4j.predicateexample;

import java.util.function.Predicate;

/**
 * Использование предиката для проверки
 * Использована хитрая перегрузка и подстановка
 *
 * При совмещении обоих условий можно попробовать сделать так
 * return check(x -> x > 0 && x % 2 == 0, num);
 *
 * Получается, что предикат раскрывается
 * при обращении к методу в котором о использован?
 *
 * (взято из Упражнений, тесты есть)
 */
public class ExampleA {

    public static boolean checkPositive(int num) {
        return checkPositive(x -> x > 0, num);
    }

    private static boolean checkPositive(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

    public static boolean checkEven(int num) {
        return checkEven(x -> x % 2 == 0, num);
    }

    private static boolean checkEven(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}