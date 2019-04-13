package ru.job4j.array;

public class Turn {

    /**
     * Метод должен переворачивать массивы
     * The method must flip arrays.
     *
     * Так как мы работаем сразу с 2-мя элементами массива
     * количество операций можно уменьшить в 2 раза без остатка
     * tmp - временная переменная для обмена местами
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}