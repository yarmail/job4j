package ru.job4j.string;

import java.time.Year;

public class Greeting {

    public static void main(String[] args) {

        String idea = "I like Java! ";
        System.out.println(idea);
        idea = idea + "But I am a newbie ";
        int year = Year.now().getValue();
        idea = idea + year;
        System.out.println(idea);
    }
}