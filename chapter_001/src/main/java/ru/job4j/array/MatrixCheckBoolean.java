package ru.job4j.array;

public class MatrixCheckBoolean {

    /**
     * Проверка диагоналей матрицы x*x
     * Check matrix diagonals
     *
     * @param data массив проверяемых значений
     *    1) Метод должен проверить, что все элементы
     * диагоналей являются true или false
     *    2) Если одна из диагоналей неправильная
     * - общий результат = false
     *   boolean result, diagonal1, diagonal2
     *- результаты проверки в общем и по диагоналям
     *   В общем цикле проверяем обе диагонали
     * Если хотя бы один элемент первой диагонали
     * не равен первому элементу -
     * проверка прерывается c общим результатом false
     * @return результат проверки
     */

    public boolean mono(boolean[][] data) {
        boolean result = false;
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i][i] != data[0][0]) {
                diagonal1 = false;
                break;
            }
            if (data[data.length - 1 - i][i] != data[data.length - 1][0]) {
                diagonal2 = false;
            }
        }
        if (diagonal2 && diagonal1) {
            result = true;
        }
    return result;
    }
}