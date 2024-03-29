package ru.job4j.exception;

/**
 * 0.1. java.lang.NullPointerException [#219364]
 * Задание
 * Вам нужно поправить проблему.
 */
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
/*
Проблема в строке
БЫЛО
if (el.length() > max)
т.к. el может равняться null

Одно из самых простых решений, добавить в if проверку на null
СТАЛО
if (el != null && el.length() > max)
 */
