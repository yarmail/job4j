package ru.job4j.streamarrtolist;

/**
 * Converting int [][] to List <Integer>
 * in various ways via stream flatMapToInt, flatMap
 * Конвертация int[][] в List<Integer> разными
 * способами через stream flatMapToInt, flatMap
 *
 * На основе задачи из 3 части
 * сконвертировать int[][] array to List<Integer>
 * сделать стрим
 */
/*
Исходный код:
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>(0);
        for (int[] rows:array) {
            for (int value: rows) {
                list.add(value);
            }
        }
        return list;
    }
*/
