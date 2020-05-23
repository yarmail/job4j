package ru.job4j.array;

public class Check {
    /**
     * Метод должен проверить, что все элементы в массиве являются true или false
     * The method should check that all elements in the array are true or false.
     *
     * @param data
     * result = true; Изначально предполагаем, что все элементы одинаковы
     * и ищем хотя бы одно недоразумение
     * первый элемент берем за образец и сравниваем с ним все элементы
     * Если хотя бы хотя бы один отличается - прерваем цикл - массив неправильный
     * @return result boolean результат проверки массива
     */

    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data [i] != data [0]) {
                    result = false;
                    break;
            }
        }
        return result;
    }
}