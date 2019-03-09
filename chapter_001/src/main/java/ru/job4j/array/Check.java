package ru.job4j.array;

public class Check {

    /**
     * Метод должен проверить, что все элементы в массиве являются true или false
     * @param data
     * @return result boolean результат проверки массива
     */

    public boolean mono(boolean[] data) {
        boolean result = true; // все элементы одинаковы
        for (int i = 0; i < data.length; i++) {
            // первый элемент берем за образец и сравниваем с ним все элементы
            if (data [i] != data [0]) {
                    result = false; // хотя бы один отличается
                    break;
            }
        }
        return result;
    }
}