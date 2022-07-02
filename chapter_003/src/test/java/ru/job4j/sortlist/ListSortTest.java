package ru.job4j.sortlist;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ListSortTest {
    List<Integer> result = Arrays.asList(5, 3, 4, 1, 2);
    List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5);

    @Test
    public void sortAscending() {
        Collections.sort(result);
        assertThat(result, is(this.expect));
    }
}