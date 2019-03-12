package ru.job4j.array;

public class BubbleSort {

    /**
     * метод должен сортировать массив по возрастанию
     * используя метод перестановок или "пузырьковой сортировки"
     * the method should sort the array in ascending order
     * using the permutation or "bubble sort method"
     * @param array
     * @return отортированный массив
     */

    public int[] sort(int[] array) {

        int tmp; // временная переменная для перестановок

        //цикл i уменьшается справа по мере выталкивания максимальных элементов
        for (int i = array.length - 1; i >= 0; i--) {
            // цикл j  пробегает внутри i и проверяет условие
            for (int j = 0; j < i; j++) {

                // проверка условия
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            } //окончание for j
        } // окончание for i
    return array;
    }
}