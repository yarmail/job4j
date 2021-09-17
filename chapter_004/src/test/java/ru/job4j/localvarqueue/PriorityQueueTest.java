package ru.job4j.localvarqueue;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Добавить var из Java 10
 */
public class PriorityQueueTest {

    private Task task1 = new Task("low", 5);
    private Task task2 = new Task("urgent", 1);
    private Task task3 = new Task("middle", 3);
    PriorityQueue queue = new PriorityQueue();

    @Test
    public void put() {
        queue.put(task1);
        queue.put(task2);
        queue.put(task3);
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}