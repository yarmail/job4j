package ru.job4j.lambda;

/**
 * Данный класс создается как вспомогательный для
 * показа статических методов арифметических операций
 * для показа ссылок на методы
 *
 * Эти методы можно заменить на интерфейс
 * BiFunction<Integer, Integer, Double> op,
 * два входящих параметра и один выходящий.
 *
 * Если такое соответствие применимо, то мы можем
 * указать использовать этот метод вместо ламбды
 * Такой вызов называется ссылка на метод.
 *
 * Синтаксис вызова (Имя класс)::(имя методы)
 * Важно, здесь не указываются параметры.
 */
public class MathUtil {
    public static double add(int left, int second) {
        return left + second;
    }

    public static double div(int left, int second) {
        return left / second;
    }

}
