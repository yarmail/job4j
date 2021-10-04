package ru.job4j.predicateexample;

import java.util.List;
import java.util.function.Predicate;

public class ExampleB {

    /**
     * Мы создаем метод, который
     * а) будет фильтровать список
     * б) распечатывать 
     * При этом условия фильтра мы не знаем (и)или задаем их в самом
     * конце, в тесте, остальное взаимодействие описываем здесь
     * (тесты есть)
     */
    public static void printFilter(List<Integer> nums, Predicate<Integer> condition) {
        for (Integer num : nums) {
            if (condition.test(num)) {
                System.out.println(num);
            }
        }
        
    }
}
