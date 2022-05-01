package ru.job4j.oopcastcollege;

/**
 * 3.1. Приведение типов.
 * Повышение типа и понижение типа. [#181322]
 *
 * Задание
 * - Создайте класс ru.job4j.oop.College с методом main.
 * - В нем сделайте приведение объекта Freshman
 * к Student, а потом к Object.
 * - Ответьте на вопрос к какому типу
 * приведения это относится?
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object obj = student;
        /*Называется Up casting*/
    }
}
