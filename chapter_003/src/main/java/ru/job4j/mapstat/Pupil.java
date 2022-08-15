package ru.job4j.mapstat;

import java.util.List;

/**
 * Класс Pupil описывает ученика.
 */
public record Pupil(String name, List<Subject> subjects) {
}
