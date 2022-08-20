package ru.job4j.mapstat;

/**
 * Класс Label содержит результаты: имя и средний балл по каки-то предметам
 * Этот класс используется как для учеников, так и для предметов.
 * (возможно каждый ученик получает какие-то баллы - за что?)
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}