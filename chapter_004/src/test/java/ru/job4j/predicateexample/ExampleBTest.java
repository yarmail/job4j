package ru.job4j.predicateexample;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ExampleBTest {

    @Test
    public void printFilter() {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ExampleB.printFilter(numList, x -> x > 5);
    }
}