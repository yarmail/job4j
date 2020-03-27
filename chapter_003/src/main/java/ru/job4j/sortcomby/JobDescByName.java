package ru.job4j.sortcomby;

import java.util.Comparator;

/**
 * Чтобы обеспечить сортировку по убыванию в компараторе
 * мы сравниваем второй параметр с первым,
 * в случае сортировки по возрастанию нужно сравнивать
 * первый параметр со вторым.
 */

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}