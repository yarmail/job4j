package ru.job4j.max;

/**
 * 5.1. Зона видимости переменных [#180147]
 * название класса - уменьшение?
 *
 * Задание
 * Код ниже содержит ошибку. Код должен вывести
 * на экран массив, который мы передали в метод to(...).
 *
 * Метод to(..) должен записать
 * аргумент array в поле класса.
 *
 */
public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}