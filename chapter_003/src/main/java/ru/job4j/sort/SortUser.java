package ru.job4j.sort;

import java.util.*;

public class SortUser {

    /**
     * Sort by age
     * Сортировать по возрасту
     * Примечание:
     * TreeSet - самосортирующийся - ему нужны указания,
     * как сортировать
     * Для такой сортировки класс User должен
     * 1 вариант: реализовать класс Comparable и
     * переопределить метод compareTo
     * 2 вариант: реализовать класс Comparator
     * и переопределить метод: compare
     */
    public Set<User> sort(List<User> list) {
        return new TreeSet<>(list);
    }

    /**
     * Sort by name length
     * Сортировка по длине имени
     * Для сортировки переопределяем компаратор
     */
    public List<User> sortNameLength(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User left, User right) {
                return Integer.compare(left.getName().length(), right.getName().length());
            }
        });
        return list;
    }

    /**
     * Sorting by name and age
     * Cортировка по имени и по возрасту
     * Для сортировки переопределяем компаратор
     */
    public List<User> sortByNameAge(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User left, User right) {
                int result = left.getName().compareTo(right.getName());
                return result != 0 ? result : Integer.compare(left.getAge(), right.getAge());
            }
        });
        return list;
    }
}