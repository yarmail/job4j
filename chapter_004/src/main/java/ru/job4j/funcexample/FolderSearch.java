package ru.job4j.funcexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 2.3. Встроенные функциональные интерфейсы. [#249209]
 * Задание.
 * 1. Ниже представлена модель данных Folder:
 * а также каркас класса SearchFolder:
 * Стало:
 * (есть тесты)
 */
public class FolderSearch {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }
}

/*
Было
public class SearchFolder {
    public static List<Folder> filterSize(List<Folder> list) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (f.getSize() > 100) {
                rsl.add(f);
            }
        }
        return rsl;
    }

    public static List<Folder> filterName(List<Folder> list) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (f.getName().contains("bug")) {
                rsl.add(f);
            }
        }
        return rsl;
    }

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        return new ArrayList<>();
    }
}
*/
