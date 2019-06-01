package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

public class TriangleTest {
    @Test
    public void drawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(),
                is (new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("+")
                        .add("++")
                        .add("+++")
                        .add("++++")
                        .toString()
                ));
    }
}