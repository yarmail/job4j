package ru.job4j.array;

import java.util.Arrays;

/**
 * 6.0.1. Объявление массива. [#3613 #4049]
 * 6.0.1.1. Размер массива [#333582]
 * 6.0.2. Заполнение массива. [#226300]
 */
public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        /*
        6.0.2. Заполнение массива. [#226300]
        Задание
        2. Создайте внутри метода main массив String на 4 ячейки.
        Дайте имя переменной созданного массива - names.
        3. Заполните массив произвольными именами.
        Заполнение производить через обращение
        по индексу.
        4. После этого выведите каждую ячейку на консоль.
        */
        String[] names = new String[4];
        names[0] = "Ivan 1";
        names[1] = "Ivan 2";
        names[2] = "Ivan 3";
        names[3] = "Ivan 4";
        Arrays.stream(names).
                forEach(el -> System.out.print(el + " "));
    }
}