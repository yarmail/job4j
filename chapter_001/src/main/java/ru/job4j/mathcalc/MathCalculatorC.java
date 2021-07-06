package ru.job4j.mathcalc;

import static ru.job4j.math.MathFunction.*;

/**
 * Статический импорт
 * Для того чтобы выполнить статический импорт надо вместе
 * с директивой import используется модификатор static.
 */
public class MathCalculatorC {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndMultiply(double first, double second) {
        return sub(first, second) + multiply(first, second);
    }

    public static double sumAndSub(double first, double second) {
        return sum(first, second) + sub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply равен : " + sumAndMultiply(10, 20));
        System.out.println("Результат subAndMultiply равен : " + subAndMultiply(10, 20));
        System.out.println("Результат sumAndSub равен : " + sumAndSub(10, 20));
    }
}
