package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>(0);
        for (int[] rows:array) {
            for (int value: rows) {
                list.add(value);
            }
        }
        return list;
    }
}
