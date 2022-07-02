package ru.job4j.sortlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 0. Сортировка [#10096 #4096]
 * Using Collections.sort List as an example
 * Использование Collections.sort на примере List
 *
 * В Java большинство коллекций поддерживает
 * метод Collections.sort, который позволяет
 * отсортировать коллекцию.
 *
 * Давайте рассмотрим это c коллекцией java.utils.List.
 * (есть тест)
 */
public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}