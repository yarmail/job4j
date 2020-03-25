package ru.job4j.sortjob;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class JobTest {

    Job job1 = new Job("Fix bugs", 4);
    Job job2 = new Job("Impl task", 2);
    Job job3 = new Job("Reboot server", 1);
    List<Job> jobs = Arrays.asList(job1, job2, job3);

    /**
     * Тестируем сортировку по приоритету на
     * основе переопределенного, встроенного
     * в модель метода compare
     */
    @Test
    public void priorityTest() {
        Job expect = job3;
        Collections.sort(jobs);
        Job result = jobs.get(0);
        assertThat(result, is(expect));
    }

    /**
     * Тестируем сортировку по имени, созданую
     * на основе класса SortByNameJob реализующего
     * интерфейс Comparator
     */
    @Test
    public void nameTest() {
        Job expect = job1;
        jobs.sort(new SortByNameJob());
        Job result = jobs.get(0);
        assertThat(result, is(expect));
    }
}