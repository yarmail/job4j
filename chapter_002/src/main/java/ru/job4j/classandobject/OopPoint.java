package ru.job4j.classandobject;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Distance between points in OOP style
 * Расстояние между точками. [#122587] в ООП стиле 03.2020
 * В начале нужно понять, а что в этом задании является
 * цельным объектом? Цельным объектом здесь будет точка
 * в системе координат.
 * То есть объект, который содержит координаты x и y.
 * Состояние в объекте хранятся в полях.
 * Поля это переменные принадлежащие конкретному объекту.
 */
public class OopPoint {

    private int x;
    private int y;

    public OopPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (OopPoint that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        OopPoint a = new OopPoint(0, 0);
        OopPoint b = new OopPoint(0, 2);
        double dist = a.distance(b);
        System.out.println(dist); //the output is 2.0
    }
}
