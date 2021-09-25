package ru.job4j.array;

/**
 * 6.6.2. Двухмерный массив. Циклы. [#306725]
 * Для работы с двухмерным массивом нужно иметь два указателя.
 * Чтобы использовать циклы с двухмерным массивом нужно использовать вложенные циклы.
 * Выведем двухмерный массив на консоль.
 *
 */
public class MatrixLoop {
    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1},
                {3, 5, 6, 4}
        };
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                System.out.print(val);
            }
        }
    }
}
/*
Вывод:
423713564
 */