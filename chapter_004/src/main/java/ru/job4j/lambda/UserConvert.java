package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Еще есть интересная особенность связанная с конструктором.
 * По сути конструктор - это метод принимающий параметры и возвращающий объект.
 * Его можно описать функциональным методом
 * Object apply(Object ... params);
 *
 * Следовательно, для конструкторов тоже
 * можно использовать вызов по ссылке.
 *
 * Давайте рассмотрим пример. У нас есть список имен,
 * и мы их хотим преобразовать в пользователей.
 */
public class UserConvert {
    public static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + '}';
        }
    }

    /**
     * Здесь:
     * forEach - дефолтный метод интерфейса Iterable
     * names.forEach(
     *                  n -> users.add(op.apply(n))
     *          );
     *  для каждого имени выполнить функцию op.apply и
     *  результат записать в список Users.
     *
     *
     */
    public List<User> convert(List<String> names, Function<String, User> op) {
        List<User> users = new ArrayList<>();
        names.forEach(
                n -> users.add(op.apply(n))
        );
        return users;
    }

    /**
     * main переименовано в main1
     * Вызов
     * List<User> data = users.convert(names, User::new);
     * User::new - преобразуется в конструктор new User(String name)
     *
     */
    public static void main1(String[] args) {
        List<String> names = Arrays.asList("Petr", "Nick", "Ban");
        UserConvert users = new UserConvert();
        List<User> data = users.convert(names, User::new);
        data.forEach(System.out::println);
    }
}