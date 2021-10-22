package ru.job4j.oop.point;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты
 */
public class PointTest {

    @Test
    public void distance2D() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 5);
        double result = a.distance2D(b);
        assertThat(result, is(4.0));
    }

    @Test
    public void distance3D() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 9);
        double result = a.distance3D(b);
        assertThat(result, is(9.0));
    }
}