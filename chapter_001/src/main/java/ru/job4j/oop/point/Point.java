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
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance2D(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2)
                + Math.pow(this.y - that.y, 2));
    }

    public double distance3D(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2)
                + Math.pow(this.y - that.y, 2)
                + Math.pow(this.z - that.z, 2));
    }
}