package ru.job4j.sortсomby;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


/**
 * Совмещаем две сортировки по убыванию
 * JobDescByName
 * JobDescByPriority
 * (Хотелось бы увидеть вариант когда нужно больше)
 */
public class JobSorterTest {

    Job job1 = new Job("Fix bug", 1);
    Job job2 = new Job("Fix bug", 4);
    Job job3 = new Job("Fix bug", 2);
    Job job4 = new Job("X task", 0);
    List<Job> jobs = Arrays.asList(job1, job2, job3, job4);
    List<Job> expect = Arrays.asList(job4, job2, job3, job1);

    /**
     * Collections.sort (...)
     * можно заменить на
     * jobs.sort(....)
     *
     */
    @Test
    public void twoDescSort(){
        jobs.sort(new JobDescByName()
                .thenComparing(new JobDescByPriority()));
        assertThat(jobs, is(expect));
    }
}