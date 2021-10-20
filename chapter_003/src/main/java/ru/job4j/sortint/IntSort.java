package ru.job4j.sortint;

/**
 * Comparable Interface and Integer Sort
 * Интерфейс Comparable и сортировка  Integer
 *
 * Чтобы использовать алгоритм сортировки,
 * сортируемый тип данных должен поддерживать
 * интерфейс java.util.Comparable.
 * Давайте откроем класс java.lang.Integer.
 * Мы видим, что этот класс реализует интерфейс
 * java.util.Comparable.
 *
 * Интерфейс Comparable имеет всего один метод compareTo(T t).
 * Этот метод возвращает меньше нуля, ноль, больше нуля.
 * Меньше нуля - если входящее значение больше,
 * чем текущий объект.
 * Ноль - если значение равны.
 * Больше нуля - если текущее значение больше,
 * чем входящее.
 * Примечание. Текущее значение -
 * это объект у которого вызван метод compareTo.
 */
public class IntSort {

    public static int intCompare() {
        Integer first = 1;
        Integer second = 2;
        return first.compareTo(second);
    }
}
/*
return
- 1
 */
