package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionRange {
    /**
     * Функция вычисляет значения выражения в диапазоне
     */
    public static List<Double> diapason(int start, int finish, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i != finish; i++) {
            result.add(func.apply(i + 0D));
        }
        return result;
    }
}
