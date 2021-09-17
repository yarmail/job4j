package ru.job4j.loop;

/**
 * 5.6. Простые числа [#156314]
 * В этом задании нужно посчитать количество простых чисел от 1 до <= finish.
 * Число finish должно входить в выборку.
 * (тесты есть)
 */
public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count+= 1;
            }
        }
        return count;
    }
}