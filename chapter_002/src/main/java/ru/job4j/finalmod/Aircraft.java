package ru.job4j.finalmod;

/**
 * Aircraft - самолет
 */
public class Aircraft {
    public void printModel() {
        System.out.println("Метод выводит в консоль модель самолета.");
    }
}

/*
Было
public final void printModel()

Стало
public void printModel()
 */
