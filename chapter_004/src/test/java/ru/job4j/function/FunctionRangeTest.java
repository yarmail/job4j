package ru.job4j.function;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FunctionRangeTest {
    /**
     * Вычисление линейной функции в диапазоне
     */
    @Test
    public void linear() {
        List<Double> result = FunctionRange.diapason(
                5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    /**
     * Вычисление квадратичной функции в диапазоне
     */
    @Test
    public void sqrt() {
        List<Double> result = FunctionRange.diapason(
                5, 8, x -> x * x + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));
    }

    /**
     * Вычисление логарифмической функции в диапазоне
     */
    @Test
    public void log() {
        List<Double> result = FunctionRange.diapason(
                5, 8, x -> Math.log(x) + 1);
        List<Double> expected = Arrays.asList(
                Math.log(5) + 1D, Math.log(6) + 1D, Math.log(7) + 1D);
        assertThat(result, is(expected));
    }
}