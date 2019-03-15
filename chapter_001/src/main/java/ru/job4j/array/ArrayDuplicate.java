package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    /**
     * Метод должен удалять дубли из массива
     * The method should remove duplicates from the array.
     *
     * @param array массив строковых значений с дублями
     * @return массив со строковыми значениями без дублей
     */

    public String[] remove(String[] array) {

        int arrLength = array.length; // длина массива

        //ищем одинаковые элементы
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                // если есть
                if (array[i].equals(array[j])) {
                    // заменяем текущий элемент последним
                    array[j] = array[arrLength - 1];
                    // укорачиваем цикл
                    arrLength--;
                    // проводим проверку заново
                    j--;
                }

            }

        }
    // возвращаем укороченный массив
    return  Arrays.copyOf(array, arrLength);
    }
}
