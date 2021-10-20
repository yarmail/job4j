package ru.job4j.condition;

/**
 * 4.6.1. Switch [#334070]
 * switch (проверяемая_переменная) {
 *     case значение1:
 *         действие1;
 *         break;
 *     case значениеN:
 *         действиеN;
 *         break;
 *     default:
 *         действие_по_умолчанию;
 *         break;
 * }
 *
 *
 */

public class SwitchWeek {

    /**
     * Задание:
     *
     * 1. Задан каркас класса. Ваша задача
     * найти день недели в зависимости от его
     * порядкового номера. Например, для 1
     * это "Понедельник", для 7 "Воскресенье".
     * Если номер не входит в диапазон [1, 7]
     * нужно вернуть "Ошибка"
     *
     *
     */
    public static String nameOfDay(int day) {
        /**
         * переменнная name будет менятся
         * в зависимости от работы switch case
         * switch (day) { - day - проверяемое значение на входе
         * case 1:    - что будет если day = 1
         * default:   - любое другое значение вместо выше перечисленных
         */
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресение";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    /**
     * Проверка
     */
    public static void main(String[] args) {
        System.out.println(nameOfDay(5));
        System.out.println(nameOfDay(10));
    }
    /*
    Вывод:
        Пятница
        Ошибка
     */
}
