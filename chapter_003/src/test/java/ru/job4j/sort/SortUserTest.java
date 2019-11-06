package ru.job4j.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortUserTest {

    User user1 = new User("Ivan", 10);
    User user2 = new User("Vovan", 20);
    User user3 = new User("Kolyan", 50);
    /**
     * Test public Set<User> sort (List<User>)
     * Класс User подготовлен к сортировке по возрасту
     */
    @Test
    public void sortTest() {

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
}