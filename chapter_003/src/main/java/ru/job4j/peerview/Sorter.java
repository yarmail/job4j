package ru.job4j.peerview;


import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Check for errors
 * Проверить на наличие ошибок
 * 1) Отсутствовал импорт
 * 2) Не вижу необходимости в явном написании конструктора по умолчанию
 * 3) метод sort можно сделать короче
 * 4) метод sortboth можно сделать короче
 *
 *
 */

public class Sorter {
    public Sorter() {

    }

    Set<User> sort(List<User> list) {
        TreeSet<User> sortedList = new TreeSet<>();
        sortedList.addAll(list);
        return sortedList;
    }

    List<User> sortnamelength(List<User> list) {
        Comparator<User> compar = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };
        list.sort(compar);
        return list;
    }

    List<User> sortboth(List<User> list) {
        Comparator<User> compar1 = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<User> compar2 = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        list.sort(compar1.thenComparing(compar2));
        return list;
    }

}
