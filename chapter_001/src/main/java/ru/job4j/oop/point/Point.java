package ru.job4j.oop.point;

/**
 * 2.1. Рефакторинг - Расстояние между точками. [#122587 #218314]
 * (в ООП стиле)
 * (тесты есть)
 *
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}