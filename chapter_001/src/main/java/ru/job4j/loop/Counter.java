package ru.job4j.loop;

/**
 * 5.0.1. Сумма чисел. [#226416]
 * В этом задании нужно написать программу,
 * которая будет подсчитывать сумму чисел от start до finish.
 * Например, start = 0, finish = 5.
 * Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет 15.
 */
public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
            }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5)); // 15
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
