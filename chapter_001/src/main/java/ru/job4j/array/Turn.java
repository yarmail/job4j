package ru.job4j.array;

public class Turn {

    /**
     * Метод должен переворачивать массивы
     * Количетво циклов в 2 раза (без остатка) меньше количества элементов
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