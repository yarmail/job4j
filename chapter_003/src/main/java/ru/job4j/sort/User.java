package ru.job4j.sort;

/**
 * Необходимо создать модель User с полями name, age.
 * Класс User должен реализовать интерфейс Comparable.
 * Подготавливаем класс к сортировке по возрасту.
 *
 * Переписываем метод toString(), чтобы иметь возможность
 * выводить объекты
 */
public class User implements Comparable<User> {
    private String name;
    private Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User user) {
        return this.age.compareTo(user.age);
    }

    @Override
    public String toString() {
        return String.format("User: %s, %s", this.name, this.age);
    }
}
