package ru.job4j.condition;

/*
Описание точки в системе координат
Description of a point in the coordinate system
(эквелибристика переменными и преобразованиями)
*/

public class Point {
    private int x; // внутренние поля класса
    private int y;


    public Point(int x, int y){ //конструктор класса
    this.x = x;  //теперь к точке A можно обращаться через This
    this.y = y;
    }

    public double distanceTo(Point that) {
        //переменая That типа Point передается входным параметром в метод Distance
        Point a = this; //обращаемся к точке A через This
        Point b = that; //обращаемся к B через That

        double result = Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
        return result;
    }

    public static void main (String[] args) {
        Point a = new Point(0,1);
        Point b = new Point(2,5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и B : " + result);
    //из-за большого количества предварительных преобразований
    // конечный метод очень лаконичный
    }
}