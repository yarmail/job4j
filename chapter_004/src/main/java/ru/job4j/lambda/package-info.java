package ru.job4j.lambda;

/**
 * ТЕОРИЯ
 *
 * Функциональный интерфейс - это интерфейс,
 * который содержит только один метод,
 * как в математике - функция
 * --------
 * К функциональному интерфесу желательно добавлять
 * аннотацию FunctionalInterface
 * -------
 * !!!
 * Ранее в переменную мы добавляли простые типы данных
 * n = 5
 * ссылочные типы данных (ссылка на объект)
 * Person vasya = new Person;
 * Теперь требуется через переменную воспользоваться методом
 * для этого мы создаем переменную типа функционального
 * интерфейса
 * ==================================
 */

/**
 * Теория Лямбда-выражения
 * Мы создаем переменную, типа Интерфейс.
 * Лямбда-выражениями заменяют создание анонимных классов
 * для реализации функциональных интерфейсов.
 * Вариант 1:
 * (value, index) -> value * index
 * (входящие параметры, через запятую без указания типа) ->
 * (операторы, работающие с входящими параметрами)
 * В данном случае мы опускаем оператор return.
 * Его можно опустить, если у нас один оператор,
 * который сразу возвращает значение.
 * ------
 * Вариант 2:
 * Расширенная форма записи:
 * (value, index) -> {
 * int result = value * index;
 * System.out.printf("Multiple %s * %s = %s %n", value, index, result);
 * return result;
 * }
 * (входящие параметры, через запятую без указания типа) ->  {
 *     операторы;
 *     return вычисленное значение;
 * }
 *
 * !!! Важно. Если функция не принимает параметры, то мы указываем пустые скобки.
 * Если функция не возвращает результат, мы не указываем return.
 * =======================================
 */

/**
 * Теория Готовые функциональные интерфейсы
 * Разработчики JDK встроили готовые функциональные
 * интерфейсы описывающие всевозможные варианты.
 * Они находятся в пакете java.util.function
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 *
 * Их можно разделить на 4 группы.
 * Consumer - принимает параметры, метод ничего не возвращает void.
 * Function - принимает параметры и возвращает значение.
 * Predicate - принимает параметры и возвращает значение типа boolean.
 * Используется для фильтрации данных.
 * Supplier - не принимает параметры, возвращает значение.
 * !!! Важно. В своем коде необходимо использовать только эти интерфейсы
 * и избегать создавать свои. Это нужно для повышение узнаваемости кода.
 * ======================================
 */

/**
 * Calculator.java
 * Пример того, как interface Operation
 * используется в качестве параметра и реализуется анонимным
 * классом new Operation()
 * ---------------
 * Интерсная запись: интерфейс был создан внутри
 * класса
 * =======================================
 */

/**
 * Теория: Ссылки на методы
 * Допустим,  ранее мы создали статические методы
 * для арифметических операций.  MathUtil.java
 *
 * Переписывать код никто просто так не даст.
 * Поэтому разработчики JDK создали возможность использовать уже
 * созданные методы для подстановки в лямбда-выражение.
 *
 * Вариант 4 в классе Calculator - для статических методов
 * Тест  whenAdd1Until4 - для статических и не статических методов
 * ==================
 *
 */

/**
 *  Теория
 * Конструкторы и функциональные методы
 * Еще есть интересная особенность связанная с конструктором.
 * По сути конструктор - это метод принимающий параметры и возвращающий объект.
 * Его можно описать функциональным методом
 * Object apply(Object ... params);
 * Следовательно для конструкторов, тоже можно использовать вызов по ссылке.
 * ======================
 */

