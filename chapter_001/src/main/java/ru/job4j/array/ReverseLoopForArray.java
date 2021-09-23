package ru.job4j.array;

/**
 * 6.4.1.1. Обход массива с последнего элемента [#361619]
 * Два варианта:
 * for (int i = numbers.length - 1; i >=0 ; i--)
 * или
 * прямой порядок, но другое обращение к элементам
 * numbers[numbers.length - 1 - i]
 */
public class ReverseLoopForArray {

    /**
     * Задание
     * В цикле мы используем прямой проход,
     * однако элементы выводятся,
     * начиная с последнего элемента в массиве.
     * Ваша задача - добавить в цикл проверку,
     * чтобы в консоль выводились только
     * элементы с четными ИНДЕКСАМИ.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                System.out.println(numbers[numbers.length - 1 - i]);
            }
        }
    }
}