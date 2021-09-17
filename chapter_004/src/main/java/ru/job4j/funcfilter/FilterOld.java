package ru.job4j.funcfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Фильтрации списка без применения
 * встроенных функциональных интерфейсов
 */
public class FilterOld {

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> result = new ArrayList<>();
        for (Attachment att: list) {
            if (att.getSize() > 100) {
                result.add(att);
            }
        }
        return result;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> result = new ArrayList<>();
        for (Attachment att: list) {
            if (att.getName().contains("bug")) {
                result.add(att);
            }
        }
        return result;
    }
}