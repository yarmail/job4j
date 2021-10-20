package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when1234() {
        double expected = 1.4;
        int x2 = 1;
        int x1 = 2;
        int y2 = 3;
        int y1 = 4;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when5678() {
        double expected = 1.4;
        int x2 = 5;
        int x1 = 6;
        int y2 = 7;
        int y1 = 8;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when9101112() {
        double expected = 1.4;
        int x2 = 9;
        int x1 = 10;
        int y2 = 11;
        int y1 = 12;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.1);
    }
}