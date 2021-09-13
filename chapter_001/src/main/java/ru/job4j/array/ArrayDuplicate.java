package ru.job4j.array;
import java.util.Arrays;

public class ArrayDuplicate {

    /**
     * The method remove should remove duplicates from the array.
     * Метод должен удалять дубли из массива
     *
     * @param array массив строковых значений с дублями
     * arrLength - длинна массива
     * Создаем 2 цикла для сравнения элементов одного массива
     * и сравниваем второй и следующие с первым
     * Если они есть - заменяем текущий элемент последним
     * Укорачиваем цикл
     * Проводим проверку заново
     * @return массив со строковыми значениями без дублей (укороченный массив)
     */

    public String[] remove(String[] array) {
        int arrLength = array.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[arrLength - 1];
                    arrLength--;
                    j--;
                }
            }
        }
    return  Arrays.copyOf(array, arrLength);
    }
}