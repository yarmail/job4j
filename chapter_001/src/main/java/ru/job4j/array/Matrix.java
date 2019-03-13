package ru.job4j.array;

public class Matrix {

    /**
     * Таблица умножения из массива (матрица)
     * The multiplication table of the array (matrix)
     *
     * @param size указывает на размер таблицы
     * @return таблица умножения заданного размера
     */

    int[][] multiple(int size) {

        int[][] table = new int[size] [size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
    return table;
    }
}
