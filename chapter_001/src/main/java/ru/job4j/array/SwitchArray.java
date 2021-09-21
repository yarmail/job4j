package ru.job4j.array;

/**
 * 6.2.1. Выход за границу массива. [#226794]
 *
 * Задание
 * Ниже дан код. Метод swapBorder -
 * меняет местами нулевой элемент и
 * последний элемент в массиве.
 * Это код падает с ошибкой java.lang.ArrayIndexOutOfBoundsException.
 * Ваша задача устранить эту ошибку.
 */
public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1]; // было [array.length];
        array[array.length - 1] = temp; // было [array.length];
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}