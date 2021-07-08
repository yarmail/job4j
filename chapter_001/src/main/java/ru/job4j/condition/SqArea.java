package ru.job4j.condition;


/**
 * В этом задании необходимо вычислить площадь прямоугольника.
 * Известны периметр и соотношение сторон прямоугольника.
 * Периметр прямоугольника вычисляется по следующей формуле:
 * p = 2 * (L + h); где L - длина, h - высота.
 * В задании известно, что длина больше высоты в k раз.
 * L = h * k;
 * Решение:
 * h = p / (2 * (k + 1));
 * L = h * k;
 * s = L * h;
 */
public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(SqArea.square(6, 3));
    }
}