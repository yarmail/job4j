package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {

        BubbleSort bubbleSort = new BubbleSort();
        //входящий тестовый массив
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        //ожидаемое значение
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        //результат
        int[] result = bubbleSort.sort(input);
        //проверка
        assertThat(result, is(expect));
    }
}
