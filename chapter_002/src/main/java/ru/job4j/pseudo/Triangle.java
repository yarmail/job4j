package ru.job4j.pseudo;

import java.util.StringJoiner;

public class Triangle implements Shape {

    public String draw() {
        String drawTriangle = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("+")
                .add("++")
                .add("+++")
                .add("++++")
                .toString();
        return drawTriangle;
    }
}