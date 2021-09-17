package ru.job4j.departments;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class DepartmentsSortTest {

    public String[] source = {
            "K1\\SK1",
            "K1\\SK2",
            "K1\\SK1\\SSK1",
            "K1\\SK1\\SSK2",
            "K2",
            "K2\\SK1\\SSK1",
            "K2\\SK1\\SSK2"
    };
    public String[] expectAbc = {
            "K1",
            "K1\\SK1",
            "K1\\SK1\\SSK1",
            "K1\\SK1\\SSK2",
            "K1\\SK2",
            "K2",
            "K2\\SK1",
            "K2\\SK1\\SSK1",
            "K2\\SK1\\SSK2"
    };
    public String[] expectCba = {
            "K2",
            "K2\\SK1",
            "K2\\SK1\\SSK2",
            "K2\\SK1\\SSK1",
            "K1",
            "K1\\SK2",
            "K1\\SK1",
            "K1\\SK1\\SSK2",
            "K1\\SK1\\SSK1"
    };

    /**
     * Сортировка в лексикографическом порядке
     */
    @Test
    public void abc() {
        DepartmentsSort testSort = new DepartmentsSort();
        Set<String> result = testSort.abc(source);
        assertThat(result, is(new LinkedHashSet<>(asList(expectAbc))));
    }

    /**
     * Сортировка в обратном лексикографическом порядке
     */
    @Test
    public void cba() {
        DepartmentsSort testSort = new DepartmentsSort();
        Set<String> result = testSort.cba(source);
        assertThat(result, is(new LinkedHashSet<>(asList(expectCba))));
    }
}