package ru.job4j.array;

public class MatrixCheck {

    /**
     * Проверка диагоналей матрицы x*x
     * Check matrix diagonals
     *
     * 1) Метод должен проверить, что все элементы диагоналей являются true или false
     * 2) Если одна из диагоналей неправильная - общий результат = false
     *
     * @param data массив проверяемых значений
     * @return результат проверки
     */

    public boolean mono(boolean[][] data) {

        // результаты проверок
        boolean result = false;
        boolean diagonal1 = true;
        boolean diagonal2 = true;

        for (int i = 0; i < data.length; i++) {
            //первая диагональ
            if (data[i][i] != data[0][0]) {
                diagonal1 = false;
                break; // нет необходимости дальше проверять
            }
            //вторая диагональ
            if (data[data.length - 1 - i][i] != data[data.length - 1][0]) {
                diagonal2 = false;
            }
        }

        if (diagonal2 && diagonal1) {
            result = true;
        }

    return result;
    } // окончание mono
}