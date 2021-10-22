package ru.job4j.inheritance.textreport;

/**
 * Задание
 * 1.Создайте класс JSONReport.
 * Он должен наследоваться от TextReport.
 * 2.Переопределите методы generate.
 * Этот метод должен вернуть шаблон в следующем формате.
 */
public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + name + ": \"name\"," + System.lineSeparator()
                + body + ": \"body\"" + System.lineSeparator()
                + "}";
    }
}