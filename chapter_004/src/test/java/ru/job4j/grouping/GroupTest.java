package ru.job4j.grouping;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class GroupTest {

    @Test
    public void sectionsTest() {

        String name1 = "student1";
        String name2 = "student2";
        String name3 = "student3";

        Set<String> units1 = Set.of("Physics", "Maths", "Russian language");
        Set<String> units2 = Set.of("Maths", "Basketball");
        Set<String> units3 = Set.of("Physics", "Football");

        List<Student> students = new ArrayList<>(
                List.of(
                        new Student(name1, units1),
                        new Student(name2, units2),
                        new Student(name3, units3)
                ));

        Map<String, Set<String>> sections = Group.sections(students);
        Map<String, Set<String>> expected = new HashMap<String, Set<String>>();
        expected.put("Maths", Set.of("student2", "student1"));
        expected.put("Russian language", Set.of("student1"));
        expected.put("Basketball", Set.of("student2"));
        expected.put("Football", Set.of("student3"));
        expected.put("Physics", Set.of("student1", "student3"));

        assertThat(sections, is(expected));
    }
}