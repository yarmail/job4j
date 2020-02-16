package ru.job4j.arrlistusage;

import java.util.ArrayList;

public class UsageArrayList {

    private ArrayList<String> names = new ArrayList<>();

    public ArrayList<String> getNames() {
        return this.names;
    }

    public void addName(String name) {
        this.names.add(name);
    }
}
