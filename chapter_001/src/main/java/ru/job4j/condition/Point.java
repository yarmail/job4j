package ru.job4j.condition;

/**
 * Description of a point in the coordinate system
 * Описание точки в системе координат
 * private int x,y внутренние поля класса
 */
public class Point {
    private int x;
    private int y;

    /**
     * public Point - конструктор класса
     * Удобно, при обращению к классу IDEA сразу просит указать необходимые параметры
     * this.x = x; // теперь к внутреннему полю x можно обращаться через This
     */

    public Point(int x, int y) {
    this.x = x;
    this.y = y;
    }

    /**
     * @param that переменая That типа Point передается входным параметром в метод Distance
     * Point a = this;
     * Point b = that; переменные A и B - это экземпляры Point ??
     * @return result расчитываем по формуле расстояния между точками
     */

    public double distanceTo(Point that) {
        Point a = this;
        Point b = that;
        double result = Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
        return result;
    }

    /**
     * из-за большого количества предварительных преобразований
     * конечный метод очень лаконичный
     * @param args
     */
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