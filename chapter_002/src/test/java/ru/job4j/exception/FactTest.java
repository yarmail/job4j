package ru.job4j.exception;

import org.junit.Test;

/**
 * 0.3. Тестирование исключений с junit [#219366]
 *
 * Задание
 * 1. Напишите тесты проверки прерывания на класс подсчета факториала.
 * 2. В тесте нужно использовать аннотацию с параметром
 */
public class FactTest {

    @Test (expected = IllegalArgumentException.class)
    public void test() {
        new Fact().calc(-1);
    }
}