package ru.job4j.enumclass;

/**
 * Enum в Java используется, когда нужно
 * работать с небольгим количеством объектов,
 * например, дни недели, времена года, месяцы
 *
 * До появления Enum использовались int
 *
 * Проблемы: int не всегда удобно,
 * если animal = 100, то непонятно какое это животное
 * появляется неопредленность, также нужна расшифровка
 * значений
 */
public class ABeforeEnum {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal) {
            case DOG:
                System.out.println("это собака");
                break;
            case FROG:
                System.out.println("это лягушка");
                break;
            default:
                System.out.println("это не животное");

        }
    }
}