package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class MergeTest {

    /**
     * test method add first < second
     */
    @Test
    public void testAdd() {
        int[] first = {1, 2};
        int[] second = {3, 4, 5};
        Merge test = new Merge(first, second);
        int[] result = test.add();
        int[] check = {1, 2, 3, 4, 5};
        assertThat(result, is(check));
    }
    /**
     * test method merge first <= second
     */
    @Test
    public void testMerge() {
        int[] first = {2};
        int[] second = {1, 4, 6};
        Merge test = new Merge(first, second);
        int[] result = test.merge(first, second);
        int[] check = {1, 2, 4, 6};
        assertThat(result, is(check));
    }
    /**
     * test method cycle
     */
    @Test
    public void testCycle() {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {4};
        Merge test = new Merge(first, second);
        boolean result = test.cycle(first, second);
        boolean check = false;
        assertThat(result, is(check));
    }

    /**
     * test method possibleAdd
     */
    @Test
    public void testPossibleAdd() {
        int[] first = {1, 2, 3};
        int[] second = {2, 5, 6};
        Merge test = new Merge(first, second);
        boolean result = test.possibleAdd();
        boolean check = false;
        assertThat(result, is(check));
    }

    /**
     * Тest result 1 - add arrays
     */
    @Test
    public void testResult1() {
        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6};
        Merge test = new Merge(first, second);
        int[] result = test.rls();
        int[] check = {1, 2, 3, 4, 5, 6};
        assertThat(result, is(check));
    }

    /**
     * Тest result 2: merge arrays
     */
    @Test
    public void testResult2() {
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4};
        Merge test = new Merge(first, second);
        int[] result = test.rls();
        int[] check = {1, 2, 3, 4, 5, 7};
        assertThat(result, is(check));
    }
}