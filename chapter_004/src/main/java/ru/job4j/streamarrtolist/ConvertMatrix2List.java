package ru.job4j.streamarrtolist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * На основе задачи из 3 части
 * сконвертировать int[][] array to List<Integer>
 * сделать стрим
 *
 */

public class ConvertMatrix2List {


    public List<Integer> toList(int[][] array) {
        return Arrays.stream(array)
                .map(row -> IntStream.range(0, array[0].length)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

}
