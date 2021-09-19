package ru.job4j.array;

/**
 * 6.0.3. Массивы и цикл for. [#226665]
 * Внутри метода main объявите массив int на 5 элементов. Через цикл for заполните
 * его значениями функции y = index * 2 + 3;
 * 3. Ниже, через цикл for выведите все элементы массива на консоль.
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 3;
            System.out.println(arr[i]);
        }
        forEach(arr);
    }

    /**
     * 6.0.3.1. Массивы и цикл for-each [#333581]
     * Второй цикл, который выводит все значения из массива в консоль
     * - перепишите на цикл for-each.
     */
    public static void forEach(int[] arr) {
        for (int el: arr) {
            System.out.println(el);
        }
    }
}
