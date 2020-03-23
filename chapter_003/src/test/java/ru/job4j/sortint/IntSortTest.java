package ru.job4j.sortint;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class IntSortTest {
    int expect = -1;

    @Test
    public void intCompare() {
        int result = IntSort.intCompare();
        assertThat(result, is(this.expect));
    }
}