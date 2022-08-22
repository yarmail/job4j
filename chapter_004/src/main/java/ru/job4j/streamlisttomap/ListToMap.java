package ru.job4j.streamlisttomap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 4. Преобразование List в Map. [#110226]
 * Задание.
 * 1. Класс Student взять из задания
 * "Фильтрация учеников".
 * 2. Вашим заданием будет реализовать метод,
 * который на вход принимает список студентов
 * List<Student> и вернет результат его преобразования
 * в Map<String, Student>, где:
 * ключ - это фамилия студента;
 * значение - объект ученика.
 *
 * Предусмотреть в реализации исключение дубликатов,
 * поскольку ключ - это фамилия, то дубликатами будут те пары,
 * у которых совпадают фамилии студентов.
 * В случае добавления дубликата необходимо
 * оставить старое значение.
 *
 * Выражение e -> e,
 * можно заменить на Function.identity()
 * т.е эдентичное выражение
 *
 * (есть тесты)
 */

public class ListToMap {
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                    Student::getSurname,
                    Function.identity(),
                    (ex, rep) -> ex
                        )
                );
    }
}