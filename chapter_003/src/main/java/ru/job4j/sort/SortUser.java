package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *  В классе SortUser написать метод
 *  public Set<User> sort (List<User>), который будет
 *  возвращать TreeSet пользователей, отсортированных
 *  по возрасту в порядке возрастания.
 */
public class SortUser {

    public Set<User> sort(List<User> list) {
        return new TreeSet<>(list);
    }
}