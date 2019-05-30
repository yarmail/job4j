package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void drawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is (new StringBuilder()
                .append("+")
                .append("++")
                .append("+++")
                .append("++++")
                .toString()
        ));
    }
}