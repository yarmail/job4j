package ru.job4j.array;

public class BubbleSort {

    /**
     * @param array массив int
     * метод должен сортировать массив по возрастанию
     * используя метод перестановок или "пузырьковой сортировки"
     * the method should sort the array in ascending order
     * using the permutation or "bubble sort method"
     *
     * tmp - временная переменная для перестановок
     * цикл i уменьшается справа по мере выталкивания максимальных элементов
     * цикл j  пробегает внутри i и проверяет условие
     * Если первый элемент больше второго, то они меняются местами
     * Таким образом, в конец цикла j выталкивается самы большой элемент
     * который отсекается циклом i.
     * @return отортированный массив
     */

    public int[] sort(int[] array) {
        int tmp;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    return array;
    }
}