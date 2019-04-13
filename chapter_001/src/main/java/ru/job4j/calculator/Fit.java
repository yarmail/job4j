package ru.job4j.calculator;

/**
 * Программа расчета идеального веса для мужчин и женщин
 * The program of calculating the ideal weight for men and women
 */

public class Fit {
    /**
     * manWeight - идеальный вес для мужчины
     * @param height
     * @return
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    /**
     * womanWeight - идеальный вес для женщины
     * @param height
     * @return
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}