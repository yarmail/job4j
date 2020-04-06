package ru.job4j.streamupturn;

/**
 * 0. Stream API улучшения[#99026] [#58167]
 * в Java 9 были добавлены новые методы для Stream
 * Теория (задание ниже)
 * Stream.takeWhile - это метод позволяет получать
 * поток данных до тех пор, пока он проходит фильтр.
 *
 * Пример:
 * List.of(2, 4, 3, 4).stream()
 *         .takeWhile(v -> v % 2 == 0)
 *         .map(v -> String.format(" %s", v))
 *         .forEach(System.out::print);
 *
 * Вывод: 2 4. Когда поток обрабатывает 3 фильтр не проходит и потом завершается.
 * Эту конструкцию удобно использовать с отсортированными данными.
 *=======
 * Stream.dropWhile - это метод позволяет получать
 * поток данных после того, как фильтр не проходит.
 * Пример:
 *
 * List.of(2, 4, 3, 4).stream()
 *         .dropWhile(v -> v % 2 == 0)
 *         .map(v -> String.format(" %s", v))
 *         .forEach(System.out::print);
 *
 * Вывод: 3, 4. Когда обрабатывается число 3 условия
 * фильтра v -> v % 2 == 0 не проходит и все значения
 * потока после 3 включая сам элемент проходят дальше в
 * потоке.
 *===========
 * Stream.ofNullable - сделает из элемент поток,
 * если элемент равен null. то возвращает пустой поток.
 * Это элемент позволяет фильтровать элементы.
 *
 * Stream.of(1, null, 2, null, 3)
 *         .flatMap(Stream::ofNullable)
 *         .map(v -> String.format(" %s", v))
 *         .forEach(System.out::print);
 *
 * Вывод: 1, 2, 3.
 * Stream.iterate(seed, predicate, next) - по сути это for цикл с индексом.
 * Пример:
 *
 * Stream.iterate(0, i -> i < 10, i -> i + 1)
 *         .map(v -> String.format(" %s", v))
 *         .forEach(System.out::print);
 *
 * Вывод: 0 1 2 3 4 5 6 7 8 9
 *
 */

/**
 *  Задание
 *  Дан класс class Student implement Comparable<Student>
 * с полями
 *
 * private String name;
 * private int scope;
 *
 * name - ФИО студента, scope - бал аттестата.
 *
 * Необходимо реализовать метод List<Student> levelOf(List<Student> students, int bound);
 *
 * Метод должен вернуть список студентов у которых балл аттестата больше bound.
 *
 * Во входящем списки могут быть null элементы.
 * Порядок действий.
 *  - Используя метод flatMap убрать null
 *  - Отсортировать список.
 *  - Используя метод takeWhile получить нужный поток.
 *  - Сохранить поток в List.
 */
