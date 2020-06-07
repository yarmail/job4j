package ru.job4j.sortlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Using Collections.sort List as an example
 * Использование Collections.sort на примере List
 *
 * В Java большинство коллекций поддерживает
 * метод Collections.sort, который позволяет
 * отсортировать коллекцию.
 *
 * Давайте рассмотрим это c коллекцией java.utils.List.
 */
public class ListSort {

    public static List<Integer> sortAscending() {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        Collections.sort(list);
        return list;
    }
}
