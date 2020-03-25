package ru.job4j.sortjob;

import java.util.Comparator;

/**
 * Создем класс для сортировки по имени
 */
public class SortByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
