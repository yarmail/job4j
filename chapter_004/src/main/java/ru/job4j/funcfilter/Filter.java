package ru.job4j.funcfilter;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;


/**
 * Решение задачи с использованием встроенных
 * функциональных интерфейсов
 */
public class Filter {

    private static List<Attachment> filterMethod(List<Attachment> list,
                                           Predicate<Attachment> filter) {
        List<Attachment> result = new ArrayList<>();
        for (Attachment att: list) {
            if (filter.test(att)) {
                result.add(att);
            }
        }
        return result;
    }

    /**
     * Анонимный класс через lambda
     * Predicate<Attachment> func = att -> att.getSize() > 100;
     *
     */
    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getSize() > 100;
            }
        };
        return filterMethod(list, func);
    }

    /**
     * Анонимный класс через lambda
     * Predicate<Attachment> func = att -> att.getName().contains("bug");
     *
     */
    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getName().contains("bug");
            }
        };
        return filterMethod(list, func);
    }
}
