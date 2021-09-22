package ru.job4j.array;

/**
 * 6.2.3. Перевернуть массив. [#226790]
 */
public class Turn {
    /**
     * Метод должен переворачивать массивы
     * The method must flip arrays.
     *
     * Так как мы работаем сразу с 2-мя элементами массива
     * количество операций можно уменьшить в 2 раза без остатка
     * tmp - временная переменная для обмена местами
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}