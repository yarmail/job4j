package ru.job4j.pseudo;

import java.util.StringJoiner;

public class Square implements Shape {

    public String draw() {
        String drawSquare = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("++++")
                .add("++++")
                .add("++++")
                .add("++++")
                .toString();
        return drawSquare;
    }
}
