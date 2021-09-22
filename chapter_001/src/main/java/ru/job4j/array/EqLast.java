package ru.job4j.array;

/**
 * 6.4.1. Сравнить последние
 * элементы двух массивов [#304228]
 *
 * Задание
 * Если последние элементы у массивов равны, то нужно вернуть true.
 * В противном случае - false.
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}