package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Напишите минимум два тест-метода,
 * один с 3 числами, другой с 5.
 */
public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3() {
        int[] data = new int[] {11, 10, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 10, 11};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5() {
        int[] data = new int[] {11, 10, 2, 4, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6, 10, 11};
        Assert.assertArrayEquals(expected, result);
    }
}