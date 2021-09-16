package ru.job4j.mathcalc;

import ru.job4j.math.MathFunction;

/**
 * Второй вариант
 * Директива import указывается в самом начале кода,
 * после чего идет имя подключаемого класса
 * (в данном случае класс MathFunction).
 *
 * В данном случае мы подключили только один класс,
 * однако если наш пакет ru.job4j.math будет содержать
 * еще другие классы, то чтобы не подключать их все по
 * отдельности – мы можем подключить весь пакет следующим образом:
 * import ru.job4j.math.*;
 */
public class MathCalculatorB {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
