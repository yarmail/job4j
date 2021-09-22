package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    /**
     * Напишите минимум два тест-метода:
     * один метод находит элемент, а другой нет.
     */
    @Test
    public void whenNotFind() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 6;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertNotEquals(expected, result);
    }

    @Test
    public void whenFindLast() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 4;
        int start = 3;
        int finish = data.length - 1;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}