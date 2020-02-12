package ru.job4j.usagearraylist;

import java.util.Arrays;
import java.util.ArrayList;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UsageArrayListTest {
    private String name1 = "Petr";
    private String name2 = "Ivan";
    private String name3 = "Stepan";
    ArrayList<String> expect =
            new ArrayList<>(Arrays.asList(name1, name2, name3));
    UsageArrayList usageArrayList = new UsageArrayList();

    @Test
    public void addName() {
        this.usageArrayList.addName(name1);
        this.usageArrayList.addName(name2);
        this.usageArrayList.addName(name3);
        ArrayList<String> result = this.usageArrayList.getNames();
        assertThat(result, is(expect));
    }
}