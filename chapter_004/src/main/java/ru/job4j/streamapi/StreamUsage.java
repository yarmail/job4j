package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Интерфейс Stream позволяет гибко работать над коллекциями.
 * Каждый элемент коллекции может проходить 3 стадии:
 * 1. Фильтрация.
 * 2. Преобразование.
 * 3. Упрощение или Хранение.
 */
public class StreamUsage {
    /**
     * Фильтрация.
     * tasks.stream() - получаем объект типа Stream
     * filter(task -> task.name.contains("Bug"))
     *
     * Для этого объекта выполняем метод filter, который
     * принимает лямбда-выражение Predicate<Task>
     *
     * task -> task.name.contains("Bug")  - задаем условие,
     * что пропускать только те задачи, которые содержат слово Bug.
     */
    public List<Task> streamFilter(List<Task> tasks) {
        return  tasks.stream()
                .filter(task -> task.getName().contains("Bug"))
                .collect(Collectors.toList());
    }

    /**
     * Преобразование.
     * Допустим, что нам нужно получить только имена задач.
     * Для этого нужно применить метод map.
     */
    public List<String> streamMap(List<Task> tasks) {
        List<String> names = tasks.stream()
                .map(task -> task.getName())
                .collect(Collectors.toList());
        return names;
    }

    /**
     * Упрощение (приведение к результату)
     * Давайте теперь посчитаем общую сумму потраченную
     * на все задачи.
     * Для этого выполним преобразование - map,
     * и упрощение - reduce(в данном случае - сложение)
     * .reduce(0L, Long::sum); - каждое значение task.spent -
     * нужно сложить с начальным значение 0L.
     * В результате мы получим общее время,
     * потраченное на все задачи.
     */
    public long streamReduce(List<Task> tasks) {
        long total = tasks.stream()
                .map(task -> task.getSpend())
                .reduce(0L, Long::sum);
        return total;
    }
}