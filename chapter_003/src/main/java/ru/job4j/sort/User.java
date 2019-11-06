package ru.job4j.sort;

/**
 * Необходимо создать модель User с полями name, age.
 * Класс User должен реализовать интерфейс Comparable.
 * Подготавливаем класс к сортировке по возрасту.
 * ---------------------------------------------
 * Old version
 * В классе User
 * @Override
 * public String toString() {
 * return String.format("User: %s, %s", this.name, this.age);
 * }
 *
 * В классе SortUserTest
 * assertThat(result.toString(), is(
 * "[User: Vovan, 10, User: Ivan, 20, User: Kolyan, 50]"));
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

}
