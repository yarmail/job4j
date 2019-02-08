package ru.job4j.calculator;

/*
Программа расчета идеального веса для мужчин и женщин
The program of calculating the ideal weight for men and women
*/

public class Fit {

    //для мужчины
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}