package ru.job4j.streamlisttohashmap;

import java.util.List;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        return (HashMap<Integer, User>) list.stream()
        .collect(Collectors.toMap(User::getId, Function.identity()));
    }
}



/*
Исходный вариант:
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.getId(), user);
        }
        return result;
    }
*/

