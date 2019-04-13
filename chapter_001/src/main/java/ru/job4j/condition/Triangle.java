package ru.job4j.condition;

/**
 * Вычисление площади треугольника через полупериметр
 * Calculating the area of a triangle through a semi-perimeter
 *
 * Используем подготовленный ранее класс Point для вычисления расстояний
 * между точками
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула (ab + ac + bc) / 2
     * @param ab расстояние между точками ab
     * @param ac расстояние между точками ac
     * @param bc расстояние между точками ac
     */

    public double period(double ab, double ac, double bc) {
        ab = this.a.distanceTo(this.b);
        ac = this.a.distanceTo(this.c);
        bc = this.b.distanceTo(this.c);
        double result = (ab + ac + bc) / 2;
        return result;
    }

/**
 *  Метод проверяет, можно ли построить треугольник с такими длинами сторон.
 *
 * If (ab < bc + ac) Or (bc < ab + ac) Or (ac < ab + bc) тогда можно
 * @param ab Длина от точки a до точки b
 * @param ac Длина от точки a до точки c
 * @param bc Длина от точки a до точки c
 * @return
*/
private boolean exist(double ab, double ac, double bc) {
    return  ((ab < bc + ac) && (bc < ab + ac) && (ac < ab + bc));
}

/**
* Метод должен вычислить площадь треугольника.
*
* @return Вернуть площадь, если треугольник существует, или -1, если треугольника нет.
*/

public double area() {
    double rsl = -1;  //мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том, что треугольника нет.
    double ab = this.a.distanceTo(this.b);
    double ac = this.a.distanceTo(this.c);
    double bc = this.b.distanceTo(this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
        rsl =  Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }
    return rsl;
}
}