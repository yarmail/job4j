package ru.job4j.exception;

/**
 * 0.2. Кидаем исключение - throw new RuntimeException [#219365]
 *
 * Задание
 * 1. Посмотрите на класс вычисления факториала.
 * 2. Добавьте проверку входного параметра в метод calc.
 * Если n < 0, то нужно прервать программу с
 * исключением IllegalArgumentException("N could not be less then 0").
 */
public class Fact {
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
/* Вывод
Exception in thread "main" java.lang.IllegalArgumentException: N could not be less then 0
 */