package ru.job4j.funcembeded;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Reduce {

    /**
     * Метод loop может посчитать любую арифметику функцию.
     * Если я правильно понимаю - мы выдкляем логику в отдельный
     * private метод и дальше пользуемся нашими обычними методами
     *
     * Не очень понятно почему мы используем BiFunction и BinaryOperator
     * вместе, ведь в задаче мы используем только Int - по идее должно быть
     * только BinaryOperator
     */
    private static int loop(int to,
                           BiFunction <Integer, Integer, Integer> func,
                           Supplier<Integer> initValue) {
        int rsl = initValue.get();
        for (int index = 1; index <= to; index++) {
            rsl = func.apply(rsl, index);
        }
        return rsl;
    }

    public static int summ(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left + right;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        };
        return loop(to, func, initValue);
    }

    public static int mult (int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left * right;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };
        return loop(to, func, initValue);
    }
}
