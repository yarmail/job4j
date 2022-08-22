package ru.job4j.enumclass;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Другие полезные свойства и методы
 *
 * .valueOf - перевод пользовательского
 * ввода в объект перечисления
 *
 * .ordinal - индекс перечисления
 * (у SOME = 3)
 *
 * .values - возможность перебирать перечисления
 * - сделано через стрим
 *
 * Другой вариант стрима
 *
 */
public enum FMethods {
    ONE, TWO, THREE, SOME;

    public static void main(String[] args) {

        System.out.println(FMethods.valueOf("ONE").name());

        System.out.println(SOME.ordinal());

        Arrays.stream(FMethods.values())
                .forEach(System.out::println);

        Stream.of(FMethods.values())
                .forEach(System.out::println);
    }
}
