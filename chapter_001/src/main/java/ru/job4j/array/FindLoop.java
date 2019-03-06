package ru.job4j.array;

/**
 *  поиск элемента в массиве
 *  search for an element in an array
 */

public class FindLoop {

    /**
     * метод должен возвратить индекс найденного элемента в массиве или -1
     * @param data массив для поиска
     * @param el элемент для поиска
     * @return индекс элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}