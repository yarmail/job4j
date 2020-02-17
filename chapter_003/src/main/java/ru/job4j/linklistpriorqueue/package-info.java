package ru.job4j.linklistpriorqueue;

/**
 * 2. Очередь с приоритетом на LinkedList [#41670]  09.02.20
 * У интерфейса java.util.List есть другая реализация java.util.LinkedList.
 * Этот класс внутри использует связанные списки.
 * Интерфейс java.util.List имеет метод add(index, value).
 * То есть мы можем добавить элемент в нужный индекс.
 * У этого метода интересное поведение.
 * Если ячейка уже занята, то элементы сдвигаются вправо,
 * а не заменяются, как в массиве.
 *
 * LinkedList<String> names = new LinkedList<String>();
 * names.add(0, "Petr");
 * names.add(0, "Ivan");
 * names.add(0, "Stepan");
 * for (String value : names) {
 *     System.out.println(value);
 * }
 * --------
 *
 * Консоль:
 * Stepan
 * Ivan
 * Petr
 *
 * Это поведение мы будем использовать для решения задания.
 * Одной из удобных структур данных является
 * очередь с приоритетами.
 * Очередь с приоритетами - это коллекция,
 * в которой элементы при добавлении располагаются
 * в определенном порядке.
 *
 * Это позволяет их извлекать в нужном порядке.
 * Например. У нас есть список задач на день с
 * указанием их важности. Мы бы хотели выполнять
 * задачи по их важности.
 *
 */