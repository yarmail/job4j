package ru.job4j.sortlist;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ListSortTest {
    List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5);

    @Test
    public void sortAscending() {
        List<Integer> result = ListSort.sortAscending();
        assertThat(result, is(this.expect));
    }
}