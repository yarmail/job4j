package ru.job4j.array;

/**
 * 6.5.1. Поиск минимального числа в массиве. [#179803]
 * В этом задании нужно найти минимальное число в массиве. Задачи поиска минимальных и максимальных чисел являются
 * базовыми задачами для большинства алгоритмов сортировок.
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}