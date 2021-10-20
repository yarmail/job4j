package ru.job4j.loop;

/**
 * В классе Paint написать метод public String piramid(int h),
 * который должен рисовать пирамиду из символа ^ и пробелов.
 * In the Paint class, write the public String method piramid (int h),
 * which should draw a pyramid of ^ and spaces.
 */

public class Paint {
    /**
     * Правый треугольник
     * Right triangle
     * @param height
     * StringBuilder screen = new StringBuilder(); ---Буфер для результата.
     * int width = height; --- ширина будет равна высоте.
     * for (int row... --- внешний цикл двигается по строкам.
     * for (int column = 0... --- внутренний цикл определяет положение ячейки в строке.
     * if (row >= column) ---- в данном случае
     * количество строк определяет, сколько галок будет в строке
     * screen.append(System.lineSeparator()); --- добавляем перевод строки.
     * @return
     */

    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Левый треугольник
     * Left triangle
     * @param height
     * @return
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Собираем пирамиду из условий правого и левого треугольников
     * We collect the pyramid from the conditions of the right and left triangles
     * @param height
     * @return
     */

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}