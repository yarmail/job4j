package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Очередь с приоритетом на LinkedList
 * Есть правда PriorityQueue, но делаем на LinkedList
 *
 * Для вставки элементов в середину LinkedList
 * дучше использовать Iterator
 *
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

     /**
     * Вводим итератор. Итератор показвает на текущий элемент или между
     * текущим и следующим.
     */
    public void put(Task task) {

        if (this.tasks.size() > 1) {
            ListIterator<Task> itr = this.tasks.listIterator();
            while (itr.hasNext()) {
                if (task.getPriority() < itr.next().getPriority()) {
                    itr.add(task);
                    break;
                }
            }
        }
        if (this.tasks.size() == 1) {
            ListIterator<Task> itr = this.tasks.listIterator();
            if (task.getPriority() < itr.next().getPriority()) {
                itr.previous();
                itr.add(task);
            }
        }
        if (this.tasks.isEmpty()) {
                this.tasks.add(task);
        }
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