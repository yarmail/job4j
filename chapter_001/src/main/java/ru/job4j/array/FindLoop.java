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
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * 6.5. Поиск индекса в диапазоне. [#156318]
     * Задание
     * В этом задании нужно усовершенствовать классический поиск.
     * Теперь нужно сделать поиск по массиву,
     * но не во всем массиве, а только в указанном диапазоне.
     * @param data массив чисел,
     * @param el элемент, который нужно найти,
     * @param start индекс, с которого начинаем поиск,
     * @param finish индекс, которым заканчиваем поиск.
     * @return
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}