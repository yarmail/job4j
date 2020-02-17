package ru.job4j.listtoarray;

import java.util.List;


public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {

        int cells;

        if (list.size() % rows == 0) {
            cells = list.size() / rows;
        } else {
            cells = list.size() / rows + 1;
        }

        int[][] array = new int[cells][rows];
        int i = 0;
        int j = 0;

        for (Integer value : list) {
            array[i][j] = value;
            j++;
            if (j > rows - 1) {
                j = 0;
                i++;

            }
        }
        return array;
    }
}