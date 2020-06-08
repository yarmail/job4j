package ru.job4j.funcembeded;

/**
 * Using built-in functional interfaces
 * Использование встроенных функциональных интерфейсов
 *
 *  Встроенные функциональные интерфейсы. [#249209]
 *  Java имеет пакет java.util.function, который
 *  содержит все необходимые функциональные интерфейсы.
 *
 *  Предположим, что нам нужно сложить или умножить все числа от 0 (или 1 для умножения) до n.
 *  Решим эту задачу без функционального интерфейса.
 *  class ReduceOld
 *
 *  Эта программа содержит копирование кода.
 *  Отличие методов summation и multiplication в арифметической операции.
 *  Давайте сделаем метод, который будет элемент вычисление описывать через интерфейс.
 *  Какой нам нужен интерфейс? Формула принимает два аргумента и возвращает значение int.
 *  Ищем интерфейс с абстрактным методом
 *
 *  R method(T, U)
 *
 *  Это интерфейс BiFunction.
 *
 *  public interface BiFunction<T, U, R> {
 *      R apply(T t, U u);
 * }
 *
 * Однако, есть еще один нюанс - начальное значение rsl.
 * Для сложение оно свое, для умножения свое.
 * Для решения этой проблемы существует функциональный
 * интерфейс, используемый как фабричный.
 * Это интерфейс Supplier
 *
 * public interface Supplier<T> {
 *     T get();
 * }
 *
 * Решение: class Reduce
 *
 *
 */
