package ru.job4j.inheritance.textreport;

/**
 * 4. Переопределение [#174890]
 * Теперь мы решили, что нам нужен еще один отчет,
 * который будет генерировать текст в html формате.
 * Для этого мы создаем наследника от TextReport
 */
public class HtmlReport extends TextReport {

    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}