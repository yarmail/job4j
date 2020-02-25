package ru.job4j.streamarrtolist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * На основе задачи из 3 части
 * сконвертировать int[][] array to List<Integer>
 * Сделать стрим.
 *
 * .flatMapToInt(i -> Arrays.stream(i))
 * Преобразовываем IntStream<int[]> в IntStream
 *
 * flatMapToInt(i -> Arrays.stream(i)) можно поменять на
 * flatMapToInt(Arrays::stream)
 */

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

}
