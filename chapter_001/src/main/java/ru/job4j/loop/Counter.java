package ru.job4j.loop;

public class Counter {
    int sum = 0;

    /**
     *  метод add должен вычислять сумму четных чисел в диапазоне от start до finish
     *  Add method must calculate the sum of even numbers in the range from start to finish
     *
     * @param start
     * @param finish
     * @return
     */

    public int add(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
