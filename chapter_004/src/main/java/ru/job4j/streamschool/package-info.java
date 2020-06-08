package ru.job4j.streamschool;

/**
 * The division of students into 3 groups according
 * to the results of academic performance
 * (Predicate, Stream API)
 * Разделение учеников на 3 группы по итогам успеваемости
 *
 * 1. Фильтрация учеников. [#110058]
 *
 * В школе пришло требование разделить 9А класс на три класса.
 * У каждого ученика есть общий балл по всем предметам.  int score;
 * score - может быть в диапазоне от 0 до 100.
 * Учеников нужно поделить на следующие группы.
 * 10А диапазон балла [70: 100],
 * 10Б диапазон балла [50: 70);
 * 10B диапазон балла (0: 50);
 *
 * Задание.
 * 1. Создайте класс Student. В классе Student должно быть одно поле int score;
 * 2. Создайте класс School c методом List<Student> collect(List<Student> students, Predicate<Student> predict);
 * 3. Создайте класс - тест SchoolTest с тремя методами для получения списка учеников для классов: А, B, C;
 * 4. В этом задании нужно использовать Stream API. метод filter и метод collect(Collectors.toList())
 */
