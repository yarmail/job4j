package ru.job4j.array;

/**
 * 6.0.4. Заполнить массив степенями чисел.
 * Одномерный массив с числами возведенными в квадрат
 * Array with numbers squared
 * (тесты есть)
 */
    public class Square {

        /**
         * Задание
         * Заполнить массив через цикл элементами
         * от 1 до bound возведенными в квадрат
         */
        public static int[] calculate(int bound) {
            int[] rst = new int[bound];
            for (int i = 0; i < bound;  i++) {
                rst[i] = (i) * (i);
            }
            return rst;
        }
    }