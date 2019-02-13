package ru.job4j.condition;

/*
проверочный класс для класса Point
проверяем метод distanceTo
Входящие значения координат точек: x1 = 1; y1 = 1; x2 = 1; y2 = 5.
Ожидаемый результат 4.0
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void test1115() {
    Point a = new Point(1, 1);
    Point b = new Point(1, 5);
    double result = a.distanceTo(b);
    assertThat(result, is(4.0));
    }
}