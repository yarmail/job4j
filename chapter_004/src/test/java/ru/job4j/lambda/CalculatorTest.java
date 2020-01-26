package ru.job4j.lambda;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * В первоначальной версии нашего метода,
 * мы не могли написать тест, из-за того, что данные выводятся в консоль.
 * В конечной версии мы изменили ситуацию и можем проверить данные.
 */
public class CalculatorTest {
    @Test
    public void whenAdd1Until3() {
        Calculator calc = new Calculator();
        List<Double> buffer = new ArrayList<>();
        calc.multiple(
                0, 3, 1,
                (value, index) -> (double) value + index,
                result -> buffer.add(result)
        );
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }

    /**
     *  ССЫЛКИ НА МЕТОДЫ
     *  MathUtil::add - статические
     *  buffer::add - не статические - от переменной
     *
     */
    @Test
    public void whenAdd1Until4() {
        Calculator calc = new Calculator();
        List<Double> buffer = new ArrayList<>();
        calc.multiple(
                0, 3, 1,
                MathUtil::add, //static call
                buffer::add // non-static call
        );
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }
}