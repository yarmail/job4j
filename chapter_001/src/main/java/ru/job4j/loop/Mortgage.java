package ru.job4j.loop;

/**
 * 5.7. Ипотека [#156315]
 */
public class Mortgage {
    /**
     * В этом задании нужно посчитать количество лет, необходимых для погашения кредита.
     * Кредитная сумма пересчитывается каждый год от остатка суммы, умноженной на процент.
     * @param amount - сумма выданная по кредиту
     * @param salary - годовой доход
     * @param percent - процентная ставка по кредиту
     * @return Метод должен вычислять количество лет, необходимых для погашения кредита.
     */
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double sumWithPercent = amount + amount * percent / 100;
        while (salary < sumWithPercent) {
            year += 1;
            sumWithPercent -= salary * percent / 100;
        }
        return  year;
    }
}