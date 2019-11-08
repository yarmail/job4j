package ru.job4j.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortUserTest {

    /**
     * Sort by age
     * Сортировать по возрасту
     * Класс User подготовлен к сортировке по возрасту
     */
    @Test
    public void sortTest() {

        User user1 = new User("Ivan", 10);
        User user2 = new User("Vovan", 20);
        User user3 = new User("Kolyan", 50);

        List<User> users = new ArrayList<>(3);
        users.add(user2);
        users.add(user1);
        users.add(user3);

        SortUser sortUser = new SortUser();
        Set<User> result = sortUser.sort(users);

        Set<User> expected = new TreeSet<>();
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);

        assertThat(result, is(expected));
    }
    /**
     * Sort by name length
     * Сортировка по длине имени
     * Для сортировки переопределяем компаратор
     */
    @Test
    public void sortNameLengthTest() {
        User user1 = new User("Ad", 10);
        User user2 = new User("Ivan", 20);
        User user3 = new User("Aleksey", 30);

        List<User> users = new ArrayList<>(3);
        users.add(user2);
        users.add(user1);
        users.add(user3);

        SortUser sortUser = new SortUser();
        List<User> result = sortUser.sortNameLength(users);

        List<User> expected = new ArrayList<>(3);
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);

        assertThat(result, is(expected));
    }

    /**
     * Sorting by name and age
     * Cортировка по имени и по возрасту
     * Для сортировки переопределяем компаратор
     */
    @Test
    public void sortByNameAgeTest() {
        User user1 = new User("Ivan", 25);
        User user2 = new User("Ivan", 30);
        User user3 = new User("Sergey", 20);
        User user4 = new User("Sergey", 25);

        List<User> users = new ArrayList<>(4);
        users.add(user2);
        users.add(user1);
        users.add(user4);
        users.add(user3);

        SortUser sortUser = new SortUser();
        List<User> result = sortUser.sortByNameAge(users);

        List<User> expected = new ArrayList<>(4);
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);
        expected.add(user4);

        assertThat(result, is(expected));
    }
}