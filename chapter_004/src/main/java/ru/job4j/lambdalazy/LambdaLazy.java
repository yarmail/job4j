package ru.job4j.lambdalazy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2.4. Ленивая загрузка [#249211]
 * Лямбда обладает свойством отложенного выполнения.
 */

public class LambdaLazy {
    /**
     * Что будет выведено на консоль? Ничего.
     * Хотя мы и добавили отладочную информацию в лямбда,
     * она не будет выведена.
     * Лямбда вычисляется, когда вызывается метод
     * у функционального интерфейса. В нашем
     * примере это метод compare.
     *
     * Он не был вызван, так как массив
     * содержит одно значение. Сортировать
     * тут не нужно.
     */
    public static void exA() {
        System.out.println("Метод exA");
        String[] names = {
                "Ivan",
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);
    }

    /**
     * В этом случае вычисление выполнено.
     * Это свойство увеличивает скорость программы.
     * Практическое применение этого свойства будет
     * в разделе Stream API.
     */
    public static void exB() {
        System.out.println("Метод exB");
        String[] names = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);
    }

    public static void main(String[] args) {
        exA();
        exB();
    }
}