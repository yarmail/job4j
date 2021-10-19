package ru.job4j.condition;

/**
 * Distance between points in a plane coordinate system
 * Расстояние между точками в плоской системе координат
 * Выглядит примерно так = кв. корень (x2-x1)*2 + (y2-y1)*2
 * (тесты сделаны)
 */
public class Point {
    public static double distance(int x2, int x1, int y2, int y1) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double result = Math.sqrt(first + second);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Point.distance(5, 6, 7, 8));
    }
}