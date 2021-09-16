package ru.job4j.mathcalc;

/**
 * Первый вариант
 * Необычная форма использования импорта
 */
public class MathCalculatorA {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
