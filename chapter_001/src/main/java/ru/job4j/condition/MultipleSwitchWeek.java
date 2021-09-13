package ru.job4j.condition;

/**
 * 4.6.2. Switch - matcher [#334071]
 * Начиная с JDK 12, мы можем писать так:
 *
 * int value = switch (str) {
 *     case "1" -> 1;
 *     case "2" -> 2;
 *     default -> 0;
 * };
 * Обратите внимание, что switch пишется после =,
 * это необходимое требование при использовании ->
 *
 */
public class MultipleSwitchWeek {

    /**
     * Задание:
     * 1. Вам на вход поступает строка.
     * Это название дня недели.
     * Оно может быть как на английском,
     * так и на русском. Ваша задача - вернуть
     * номер дня недели
     */
    /*
    public static int numberOfDay(String name) {
    return switch (name) {
        case "Понедельник", "Monday" -> 1;
        case "Вторник", "Tuesday" -> 2;
        default -> -1;
        };
    }
    */
}
