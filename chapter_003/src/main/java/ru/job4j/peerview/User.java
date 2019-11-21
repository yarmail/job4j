package ru.job4j.peerview;

/**
 * вспомогательный класс для проверки кода
 */
    public class User {
    private int age;
    private String name;
    private String passport;

    public User(int age, String name, String passport) {
        this.age = age;
        this.name = name;
        this.passport = passport;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
