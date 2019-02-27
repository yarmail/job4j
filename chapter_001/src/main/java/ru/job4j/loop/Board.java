package ru.job4j.loop;

/*
Шахматная доска из символов X и пробелов.
Chess board of X characters and spaces.
*/


public class Board {
    /**
     * @param height  количество строк по высоте
     * @param width количество символов в строке
     * @return строка символов с разделителями в виде шахматной доски
     */

    public String paint(int height, int width) {
        StringBuilder screen = new StringBuilder(); // класс работы со строками
        String ln = System.lineSeparator(); // метод возвращает системно-зависимый разделитель строк
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {  // для X сумма индексов четное число
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку
            screen.append(ln);
        }
        return screen.toString();
    }
}
