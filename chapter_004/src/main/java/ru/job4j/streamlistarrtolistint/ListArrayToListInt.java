package ru.job4j.streamlistarrtolistint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListArrayToListInt {

    public List<Integer> convert(List<int[]> list) {
        return list.stream()
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
    }
}
