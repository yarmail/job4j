package ru.job4j.localvarqueue;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Очередь с приоритетом на LinkedList
 * Интерфейс java.util.List имеет метод add(index, value).
 * У этого метода интересное поведение.
 * Если ячейка уже занята, то элементы сдвигаются вправо,
 * а не заменяются, как в массиве.
 *
 * Добавить var из Java 10
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позицию определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {

        if (this.tasks.size() > 1) {
            var itr = this.tasks.listIterator();
            while (itr.hasNext()) {
                if (task.getPriority() < itr.next().getPriority()) {
                    itr.add(task);
                    break;
                }
            }
        }
        if (this.tasks.size() == 1) {
            var itr = this.tasks.listIterator();
            if (task.getPriority() < itr.next().getPriority()) {
                itr.previous();
                itr.add(task);
            }
        }
        if (this.tasks.isEmpty()) {
                this.tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}