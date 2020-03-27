package ru.job4j.sortuser;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class UserTest {
    User user1 = new User("ddd", 40);
    User user2 = new User("ccc", 20);
    User user3 = new User("ccc", 30);
    User user4 = new User("aaa", 10);

    List<User> users = Arrays.asList(user1, user2, user3, user4);
    List<User> expect = Arrays.asList(user4, user2, user3, user1);

    /**
     * Тестируем случай, когда сортировка производится
     * сразу и по имени и по возрасту
     * с использованием Comparable
     */
    @Test
    public void nameAgeTest() {
        Collections.sort(this.users);
        assertThat(this.users, is(this.expect));
    }
}