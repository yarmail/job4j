package ru.job4j.streamlisttohashmap;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserConvertTest {

    @Test
    public void process() {
        UserConvert userConvert = new UserConvert();

        List<User> users = new ArrayList<>(3);
        users.add(new User(1, "Ivan", "Moscow"));
        users.add(new User(2, "Vovan", "Sarov"));
        users.add(new User(3, "Kolyan", "Sverdlov"));

        HashMap<Integer, User> result = userConvert.process(users);
        assertThat(result.get(3).getName(), is("Kolyan"));
    }
}