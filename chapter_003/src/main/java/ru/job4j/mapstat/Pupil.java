package ru.job4j.mapstat;

import java.util.List;

/**
 * Класс Pupil описывает ученика.
 * У него есть имя и список предметов
 * которые он изучает
 */
public record Pupil(String name, List<Subject> subjects) {
}
