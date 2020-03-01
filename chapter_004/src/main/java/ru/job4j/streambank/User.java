package ru.job4j.streambank;

import java.util.Objects;

/**
 * User options
 * Параметры пользователя
 */
public class User {
    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
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

    /**
     * Генерируем equals и hashCode
     * через Alt+Insert для переопределения
     * сравнения для этого объекта для HashMap
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return name.equals(user.name)
                && passport.equals(user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
}
