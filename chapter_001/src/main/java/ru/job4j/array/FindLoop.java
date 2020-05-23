package ru.job4j.array;

/**
 *  Поиск элемента в массиве
 *  Search for an element in an array
 */
public class FindLoop {

    /**
     * метод должен возвратить индекс найденного элемента в массиве или -1
     * @param data массив для поиска
     * если элемента нет в массиве, то возвращаем -1.
     * если есть - результат равен индексу (номеру) элемента.
     * @param el элемент для поиска
     * @return индекс элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}