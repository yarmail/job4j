package ru.job4j.array;

/**
 * 6.6.1. Двухмерный массив. Вывод на консоль. [#226796]
 * Задание
 * 1. Создайте класс ru.job4j.array.Sequence с методом main.
 * 2. Внутри метода main объявите двойной массив типа int 3 на 3.
 * 3. Заполните его цифрами от 1 до 9.
 * В этом задании не надо использовать циклы. Явно укажите номер ячейки и значение.
 */

public class Sequence {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
    }
}