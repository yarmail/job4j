package ru.job4j.sortuser;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Организовать сортировку User [#10034 #4098]
 *
 * В Java есть интерфейс java.util.Set.
 * Классы этого интерфейса -
 * это java.util.HashSet и java.util.TreeSet.
 * Как вы знаете, эти коллекции имеют свои особенности.
 * Они не содержат дубликатов.
 *
 *
 * TreeSet требует от входящего типа данных
 * поддержания интерфейса java.util.Comparable.
 * При каждой вставке в TreeSet элемент будет
 * искать нужную ячейку через механизм
 * сравнения элементов. Внутри TreeSet используется
 * бинарное дерево поиска. Подробно про внутреннее
 * устройство TreeSet будет рассказано в следующем уровне.
 *
 */
public class TreeSort {
    /**
     * В этом уроке мы поговорим про java.util.TreeSet.
     * Эта коллекция сразу сортирует элементы.
     * Вывод:
     * [1, 3, 5]
     * (коллекция сразу сортирует элементы)
     */
    public static void one() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
    }

    /**
     * Давайте рассмотрим вариант,
     * когда нам нужно расположить элементы по убыванию.
     * Для этого в конструктор коллекции нужно передать
     * компаратор.
     * Вывод:
     * [6, 4, 2]
     */
    public static void two() {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        one();
        two();
    }
}