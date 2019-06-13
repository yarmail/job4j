package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

public class SquareTest {
    @Test
    public void drawSquare() {
        Square square = new Square();
        assertThat(square.draw(),
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("++++")
                .add("++++")
                .add("++++")
                .add("++++")
                .toString()
        ));
    }
}