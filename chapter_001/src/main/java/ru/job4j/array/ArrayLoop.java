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
        for (int i = 0; i < 5; i++) {
            arr[i] = i * 2 + 3;
            System.out.println(arr[i]);
        }
    }
}
