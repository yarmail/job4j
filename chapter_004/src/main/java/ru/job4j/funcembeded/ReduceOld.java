package ru.job4j.funcembeded;


/**
 * Решение задачи без функционального интерфейса.
 */

public class ReduceOld {

    public static int summ(int to) {
        int rsl = 0;
        for (int index = 0; index <= to; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static int mult(int to) {
        int rsl = 1;
        for (int index = 1; index <= to; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
