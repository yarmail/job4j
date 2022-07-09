package ru.job4j.lambdause;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 2.1. Лямбда блок [#249208 #318718]
 * Задание
 * Сравнение должно быть в порядке убывания длин строк.
 * Здесь у нас есть список строк strings,
 * который мы сортируем с помощью нашего компаратора
 * и выводим список строк в консоль.
 *  Добавьте отладочную информацию в лямбда-выражении в этом каркасе.
 */
public class LambdaUsage {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a",  "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return  Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}