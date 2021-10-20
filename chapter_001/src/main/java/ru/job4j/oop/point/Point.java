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

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и B : " + result);
    }
}
/*
Вывод
x1 = 0
y1 = 0
x2 = 2
y2 = 2
Расстояние между точками А и B : 2.8284271247461903
 */