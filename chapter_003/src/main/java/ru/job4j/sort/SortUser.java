package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *  В классе SortUser написать метод
 *  public Set<User> sort (List<User>), который будет
 *  возвращать TreeSet пользователей, отсортированных
 *  по возрасту в порядке возрастания.
 *  Странно: result - local variable is redundant
 */
public class SortUser {

    public Set<User> sort(List<User> list) {
        Set<User> result = new TreeSet<>(list);
        return result;
    }
}