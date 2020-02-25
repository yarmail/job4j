package ru.job4j.streamlistarrtolistint;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListArrayToListIntTest {

    @Test
    public void convert() {
        ListArrayToListInt listConvert = new ListArrayToListInt();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{4, 5, 6, 7});
        List<Integer> result = listConvert.convert(list);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertThat(result, is(expected));

    }
}