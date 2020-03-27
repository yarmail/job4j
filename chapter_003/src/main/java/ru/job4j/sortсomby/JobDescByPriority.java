package ru.job4j.sortсomby;

import java.util.Comparator;

/**
 * Чтобы обеспечить сортировку по убыванию в компараторе
 * мы сравниваем второй параметр с первым,
 * в случае сортировки по возрастанию нужно сравнивать
 * первый параметр со вторым.
 */

public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}