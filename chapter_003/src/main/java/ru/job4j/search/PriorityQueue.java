package ru.job4j.search;

import java.util.LinkedList;

/**
 * Очередь с приоритетом на LinkedList
 * Есть правда PriorityQueue, но делаем на LinkedList
 *
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Если параметр priority у task < проверяемого -
     * size принимает значение индекса позиции,
     * в которую пойдет новый элемент
     */
    public void put(Task task) {
        int size = tasks.size();
        for (int i = 0; i < tasks.size(); i++) {
            if (task.getPriority() < tasks.get(i).getPriority()) {
                size = tasks.indexOf(tasks.get(i));
                break;
            }
        }
        tasks.add(size, task);
    }

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     */
    public Task take() {
        return this.tasks.poll();
    }
}