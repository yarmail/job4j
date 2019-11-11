package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Очень часто возникает ситуация, когда нужно сравнить два слова.
 * В этом задании нельзя использовать метод String.compateTo.
 * В это задании нужно создать подобный метод самому.
 *
 * Вам нужно реализовать компаратор для сравнения двух массивов символов.
 * Необходимо реализовать поэлементное сравнение двух списков,
 * т.е. сравниваем элементы двух списков, находящихся
 * на одних и тех же позициях (по одним и тем же индексом).
 * Сравнение в лексикографическом порядке.
 *
 * Вы можете использовать
 * String.charAt(int index)
 * Integer.compare(int left, int right),
 * Character.compare(char left, char right);
 *
 * вам нужно сделать  чтоб получилось как в словаре
 * например "як" больше чем "велосипед"
 *
 * Если слова разной длины, то result показывет какое больше
 */
public class ListCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        int num = Math.min(left.length(), right.length());

        int result = left.length() - right.length();
        for (int i = 0; i < num; i++) {
            int comp = Character.compare(left.charAt(i), right.charAt(i));
            if (comp != 0) {
                result = comp;
                break;
            }
        }
        return result;
    }
}
