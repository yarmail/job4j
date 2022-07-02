package ru.job4j.sortuser;

/**
 * есть тесты
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

    /**
     * Подключаем сравнение по 2-м параметрам
     * Сначала по имени, потом по возрасту
     */
    @Override
    public int compareTo(User user) {
        int result = 0;
        result = this.name.compareTo(user.name);
        if (result == 0) {
            result = this.age.compareTo(user.age);
        }
        return result;
    }
}
