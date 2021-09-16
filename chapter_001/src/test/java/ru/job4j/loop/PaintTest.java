package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PaintTest {
    /*
    тест для правостороннего треугольника
     */

    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /*
    тест для левостороннего треугольника
     */

    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /*
    тест для пирамиды
     */

    @Test
    public void whenPyramid() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        assertThat(rst,
                    is(
                            new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                    .add("   ^   ")
                                    .add("  ^^^  ")
                                    .add(" ^^^^^ ")
                                    .add("^^^^^^^")
                                    .toString()
                    )
            );
        }

}

