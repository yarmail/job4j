package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Интерфейс Stream позволяет гибко работать над коллекциями.
 * Каждый элемент коллекции может проходить 3 стадии:
 * 1. Фильтрация.
 * 2. Преобразование.
 * 3. Упрощение или Хранение.
 */
public class StreamUsageTest {
    Task task1 = new Task("Bug #1", 100);
    Task task2 = new Task("Task #2", 100);
    Task task3 = new Task("Bug #3", 100);
    List<Task> tasks = Arrays.asList(task1, task2, task3);
    StreamUsage streamUsage = new StreamUsage();

    /**
     *  Тестируем фильтрацию Stream
     *  expect находим через for each
     */
    @Test
    public void streamFilterTest() {
        List<Task> expect = new ArrayList<>();
        for (Task task: tasks) {
            if (task.getName().contains("Bug")) {
                expect.add(task);
            }
        }
        List<Task> result = this.streamUsage.streamFilter(this.tasks);
        assertThat(result, is(expect));
    }

    /**
     * Тестируем преобразование (map) потока
     * expect находим через for each
     */
    @Test
    public void streamMapTest() {
        List<String> expect = new ArrayList<>();
        for (Task task: tasks) {
            expect.add(task.getName());
        }
        List<String> result = this.streamUsage.streamMap(this.tasks);
        assertThat(result, is(expect));
    }

    /**
     * Проверяем метод Reduce
     * (в данном случае аккумулятор чисел)
     * expect находим через for each
     */
    @Test
    public void streamReduce() {
       long expect = 0L;
       for (Task task: tasks) {
           expect = expect + task.getSpend();
       }
       long result = this.streamUsage.streamReduce(this.tasks);
       assertThat(result, is(expect));
    }
}