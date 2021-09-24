package ru.job4j.array;

/**
 * 6.5.2. Поиск минимума в диапазоне. [#179804]
 * В этом задании нужно найти минимум в массиве в диапазоне индексов.
 * Эта задача подготавливает нас к алгоритму сортировки выборкой.
 * (тесты есть)
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}