package ru.job4j.typeconversion;

/**
 * 1. Ниже представлены строки кода.
 * В них представлены пары в которых происходит
 * преобразование типов.
 * Вам необходимо их разделить на 2 группы -
 * преобразование, которое происходит с потерей
 * данных и преобразование без потери данных.
 */
public class Task {
    /**
     * Ответ: -127 с потерей
     */
    public static void one() {
        long l = 129;
        byte b = (byte) l;
        System.out.println("первое выражение" + b);
    }

    /**
     * Ответ: -7197 - с потерей
     */
    public static void two() {
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("второе выражение" + rsl);
    }

    /**
     * Ответ 45000.0 - без потери
     */
    public static void three() {
        char c = 45000;
        float i = c;
        System.out.println("третье выражение" + i);
    }

    /**
     * Ответ: 121 - с потерей
     */
    public static void four() {
        double d = 121.19;
        byte b = (byte) d;
        System.out.println("четвертое выражение" + b);
    }

    /**
     * Отвеет: 1500.0 - без потери
     */
    public static void five() {
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println("пятое выражение" + d);
    }

    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
   }



}
