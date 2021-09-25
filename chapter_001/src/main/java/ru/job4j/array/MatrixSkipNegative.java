package ru.job4j.array;

/**
 * 6.6.3. Двухмерный массив. If. [#306727]
 */
public class MatrixSkipNegative {
    /**
     * Задание
     * Метод skip должен заменить отрицательные значения в массиве на ноль.
     */
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}