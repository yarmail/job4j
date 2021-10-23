package ru.job4j.date;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;

/**
 * Задание к уроку
 * 6. Date. Отображение даты. [#310017]
 * Делается без проекта Tracker
 */
public class Item {
    private final LocalDateTime created = now();

    public LocalDateTime getCreated() {
        return created;
    }
}