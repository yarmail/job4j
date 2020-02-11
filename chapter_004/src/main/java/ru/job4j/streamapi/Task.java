package ru.job4j.streamapi;

public class Task {
    private final String name;
    private final long spend;

    public Task(String name, long spend) {
        this.name = name;
        this.spend = spend;
    }

    public String getName() {
        return name;
    }

    public long getSpend() {
        return spend;
    }
}
