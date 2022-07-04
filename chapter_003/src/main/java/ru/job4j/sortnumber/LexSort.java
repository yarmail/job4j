package ru.job4j.sortnumber;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 4. Сортировка номера [#221284]
 * 1. Реализуйте компаратор LexSort.
 * Он должен сравнивать номер, а не целиком строку.
 * (есть тесты, в них примеры)
 */
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return convert(o1).compareTo(convert(o2));
    }

    public Integer convert(String string) {
        return  Stream.of(string.split("\\."))
                .findFirst()
                .map(Integer::parseInt)
                .get();
    }
}
/*
Альтернативный вариант
public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int leftValue = Integer.parseInt(left.split(". ")[0]);
        int rightValue = Integer.parseInt(right.split(". ")[0]);
        return Integer.compare(leftValue, rightValue);
    }
*/