package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    /**
     * проверка больший из двух
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * проверка больший из трех
     */
    @Test
    public void whenTreeMoreTwoAndOne() {
        Max mxm = new Max();
        int result = mxm.max(1, 2, 3);
        assertThat(result, is(3));
    }
}