package ru.job4j.array;

/**
 * 6.0.1. Объявление массива. [#3613 #4049]
 * 6.0.1.1. Размер массива [#333582]
 */
public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}