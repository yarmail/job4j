package ru.job4j.predicateexample;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleATest {

    @Test
    public void checkPositive() {
        assertTrue(ExampleA.checkPositive(1));
        assertFalse(ExampleA.checkPositive(-1));
        assertFalse(ExampleA.checkPositive(0));
    }

    @Test
    public void checkEven() {
        assertTrue(ExampleA.checkEven(2));
        assertFalse(ExampleA.checkEven(1));
    }
}