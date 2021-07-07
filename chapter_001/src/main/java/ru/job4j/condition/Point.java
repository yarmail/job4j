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

/* Старое решение чарез два объекта с использованием this и that

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
    this.x = x;
    this.y = y;
    }

    public double distanceTo(Point that) {
        Point a = this;
        Point b = that;
        double result = Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
        return result;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и B : " + result);
    }
}

*/