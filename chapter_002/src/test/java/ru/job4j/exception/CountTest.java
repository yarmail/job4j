package ru.job4j.exception;

import org.junit.Test;

/**
 * 0.3. Тестирование исключений с junit [#219366]
 *
 * (задание в классе FactTest)
 */
public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }
}


/*
В следующем уроке мы познакомимся
с блоком try-catch. Важно. В тестах блоки
try-catch писать не нужно.
Ниже приведен неправильный код. Так делать не надо.
Приведенный код содержит дублирующие конструкции
try-catch и fail и assertThat.
Код становится запутанный.

    @Test
    public void whenStartGreaterThenFinish() {
        try {
            Count.add(10, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("Start should be less then finish."));
        }
    }
 */