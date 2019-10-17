package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ConvertList2ArrayTest {

    /**
     * List<Integer> to 2D array
     */
    @Test
    public void toArray() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    /**
     * List<int[]> to List<Integer>
     */
    @Test
    public void convert() {
        ConvertList2Array listConvert = new ConvertList2Array();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{4, 5, 6, 7});
        List<Integer> result = listConvert.convert(list);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertThat(result, is(expected));
    }
}
