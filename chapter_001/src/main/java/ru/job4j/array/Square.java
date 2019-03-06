package ru.job4j.array;

/**
 * Одномерный массив с числами возведенными в квадрат
 * Array with numbers squared
 */

    public class Square {

        /**
         * метод расчета массива
         *
         * @param bound - заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
         * @return - результат расчета
         */

        public int[] calculate(int bound) {
            int[] rst = new int[bound];

            for (int i = 0; i < bound;  i++) {
                rst[i] = (i + 1) * (i + 1);
            }
            return rst;
        }
    }

