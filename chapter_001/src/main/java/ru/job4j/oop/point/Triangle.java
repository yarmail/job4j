package ru.job4j.oop.point;

/**
 * 2.2. Рефакторинг - Площадь треугольника. [#122642]
 * (тесты есть)
 */
public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(Point first, Point second, Point third) {
        a = first.distanceTo(second);
        b = second.distanceTo(third);
        c = third.distanceTo(first);
    }

    /**
     * exist() - проверяет возможно ли из сторон с длинами
     * a, b и c построить треугольник. Для этого сумма
     * длин двух сторон должна быть строго больше третьей стороны,
     * для всех возможных сочетаний.
     */
    boolean exist() {
        return a < (b + c) || b < (a + c) || c < (a + b);
    }

    /**
     * выполняет расчет полупериметра треугольника.
     * p = (a + b + с) /2
     */
    public double semiPerimeter() {
        return (a + b + c) / 2;
    }

    /**
     * Площадь треугольника
     */
    public double area() {
        double result = -1;
        if (exist()) {
            double p = semiPerimeter();
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return  result;
    }
}