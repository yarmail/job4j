package ru.job4j.loop;

public class Factorial {

    int result;

    /*
    Расчет факториала.
    Calculation of factorial.
     */

    public int calc(int n) {
        // первый случай когда n = 0, результат 1
        // второй случай когда n = 5, результат 120
        result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}