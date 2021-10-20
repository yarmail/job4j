package ru.job4j.loop;

/**
 * 5.5. Простое число [#171694]
 * Оператор прерывания цикла - break
 * (тесты есть)
 */
public class CheckPrimeNumber {
    /**
     * Странное упрощение предлагает IDEA
     * Изначально было:
     * primeNumber = true;
     * if (number = 1) -> primeNumber = false
     * Стало:
     * boolean primeNumber = number != 1;
     *
     * if (number % index == 0) { -> если остаток от деления равен 0
     *
     */
    public static boolean check(int number) {
        boolean primeNumber = number > 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }
}