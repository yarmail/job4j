package ru.job4j.sortuser;

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
     *
     * Примечание
     * - в Java 8 добавление элементов - add
     * - в Java 9 для создания списка можно использовать
     * List.of(u1, u2, u3)
     */
    @Test
    public void sortTest() {

        User user1 = new User("Ivan", 10);
        User user2 = new User("Vovan", 20);
        User user3 = new User("Kolyan", 50);

        List<User> users = new ArrayList<>(
                List.of(user2, user1, user3)
        );

        SortUser sortUser = new SortUser();
        Set<User> result = sortUser.sort(users);

        Set<User> expected = new TreeSet<>(
                Set.of(user1, user2, user3)
        );
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

        List<User> users = new ArrayList<>(
                List.of(user2, user1, user3)
        );

        SortUser sortUser = new SortUser();
        List<User> result = sortUser.sortNameLength(users);

        List<User> expected = new ArrayList<>(
                List.of(user1, user2, user3)
        );
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

        List<User> users = new ArrayList<>(
                List.of(user2, user1, user4, user3)
        );


        SortUser sortUser = new SortUser();
        List<User> result = sortUser.sortByNameAge(users);

        List<User> expected = new ArrayList<>(
                List.of(user1, user2, user3, user4)
        );
        assertThat(result, is(expected));
    }
}