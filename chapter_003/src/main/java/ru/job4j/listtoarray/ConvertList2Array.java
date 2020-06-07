package ru.job4j.listtoarray;

import java.util.List;

/**
 * Convert List to two-dimensional array
 * Конвертация List в двухмерный массив
 */
public class ConvertList2Array {

    /**
     * В этой задаче мы сталкиваемся с первой проблемой -
     * у нас есть количество строк, мы должны узнать
     * количество ячеек в строке
     * При обычном делении результатом 7 / 3 будет 2. То есть Java
     * округляет полученное число в меньшую сторону.
     * В Java есть класс Math с методом ceil, который позволяет
     * сделать округление в большую сторону.
     * Метод сeil принимает тип double, поэтому нам нужно делимое
     * привести к типу double, чтобы результат деления был double.
     * С другой стороны метод ceil возвращает тип double,
     * а нам нужен тип int, поэтому и приводим его к типу
     * int после вычисления.
     *
     * В Java все пустые элементы массива заполняются
     * значениями по умолчанию. То есть для типа int все
     * элементы будут сразу заполнены 0. Это дает нам
     * возможность не заполнять хвост массива.
     *
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[cells][rows];
        int i = 0;
        int j = 0;

        for (Integer value : list) {
            array[i][j] = value;
            j++;
            if (j > rows - 1) {
                j = 0;
                i++;

            }
        }
        return array;
    }
}