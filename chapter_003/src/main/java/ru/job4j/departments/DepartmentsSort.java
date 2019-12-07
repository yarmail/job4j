package ru.job4j.departments;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


public class DepartmentsSort {

    /**
     * Сортировка в лексикографическом порядке
     */
    public Set<String> abc(String[] departments) {
        TreeSet<String> result = new TreeSet<>();
        for (String str: departments) {
            StringBuilder strBuild = new StringBuilder();
            for (String splitString: str.split("\\\\")) {
                strBuild.append(splitString);
                result.add(strBuild.toString());
                strBuild.append("\\");
            }
        }
        return result;
    }
    /**
     * Сортировка в обратном лексикографическом порядке
     */
    public Set<String> cba(String[] departments) {
        Set<String> result = new TreeSet<>(Comparator.reverseOrder());
        result.addAll(abc(departments));
        return result;



    }

}
