package ru.job4j.calculator;

/**
 * The program of calculating the ideal weight for men and women
 * Программа расчета идеального веса для мужчин и женщин
 * (сделаны тесты)
 */

public class Fit {
    /**
     * manWeight - идеальный вес для мужчины
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }
    /**
     * womanWeight - идеальный вес для женщины
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 180 is " + man);
    }

}