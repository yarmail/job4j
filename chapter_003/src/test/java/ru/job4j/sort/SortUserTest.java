package ru.job4j.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortUserTest {

    @Test
    /**
     * Test public Set<User> sort (List<User>)
     */
    public void sort() {

        List<User> users = new ArrayList<>(3);
        users.add(new User("Ivan", 20));
        users.add(new User("Vovan", 10));
        users.add(new User("Kolyan", 50));

        SortUser sortUser = new SortUser();
        Set<User> result = sortUser.sort(users);
        assertThat(result.toString(), is(
        "[User: Vovan, 10, User: Ivan, 20, User: Kolyan, 50]"));
    }
}