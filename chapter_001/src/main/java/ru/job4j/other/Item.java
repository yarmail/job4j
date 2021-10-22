package ru.job4j.other;

/**
 * 2. Перегрузка конструктора [#173890]
 * выполняю задание отдельно от проекта Tracker
 */
public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}