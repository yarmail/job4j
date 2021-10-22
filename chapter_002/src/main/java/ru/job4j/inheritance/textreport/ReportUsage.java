package ru.job4j.inheritance.textreport;

/**
 * Давайте напишем класс, который выводит отчет на консоль.
 *
 * На следующей итерации меняем TextReport на HtmlReport
 * чтобы посмотреть, как меняется переопределенный метод generate
 *
 * на следующей итерации заменяем на JSONReport
 */
public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}