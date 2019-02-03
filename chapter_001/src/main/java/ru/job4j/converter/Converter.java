package ru.job4j.converter;

public class Converter {

    public int rubleToEuro (int value) {
        int evro = value / 70;
        return evro;
    }

    public int rubleToDollar (int value) {
        int dollar = value / 60;
        return dollar;
    }

    public int evroToRuble (int value) {
        int ruble = value * 70;
        return ruble;
    }
    public int dollarToRuble (int value) {
        int ruble = value * 60;
        return ruble;
    }
}
