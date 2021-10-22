package ru.job4j.inheritance.textreport;

/**
 * 4. Переопределение [#174890]
 * В этом уроке мы познакомимся с механизмом
 * переопределения метода. Переопределение позволяет
 * задать новое поведение уже существующего метода.
 *
 * Механизм переопределения (overriding)
 * существует только при условии наследования.
 *
 * Давайте рассмотрим пример с классами
 * TextReport и его наследнике HtmlReport.
 */
public class TextReport {

    /**
     * Класс имеет метод, который принимает два параметра.
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
