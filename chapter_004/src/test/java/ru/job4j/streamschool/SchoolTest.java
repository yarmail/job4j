package ru.job4j.streamschool;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * p1-p3 - условия отбора согласно задачи
 */
public class SchoolTest {

    Student vasya = new Student(80, "Вася");
    Student petya = new Student(90, "Петя");
    Student kolya = new Student(60, "Коля");
    Student misha = new Student(30, "Миша");
    List<Student> students = Arrays.asList(vasya, petya, kolya, misha);

    Predicate<Student> p1 = obj -> (obj.getScore() >= 70) && (obj.getScore() <= 100);
    Predicate<Student> p2 = obj -> (obj.getScore() >= 50) && (obj.getScore() < 70);
    Predicate<Student> p3 = obj -> (obj.getScore() > 0) && (obj.getScore() < 50);

    /**
     * Отбираем учеников в 10 A
     */
    @Test
    public void class10A() {
        List<Student> result = School.collect(students, p1);
        assertThat(result.toString(), is("[Вася, Петя]"));
    }

    /**
     * Отбираем учеников в 10 Б
     */
    @Test
    public void class10B() {
        List<Student> result = School.collect(students, p2);
        assertThat(result.toString(), is("[Коля]"));
    }

    /**
     * Отбираем учеников в 10 В
     */
    @Test
    public void class10V() {
        List<Student> result = School.collect(students, p3);
        assertThat(result.toString(), is("[Миша]"));
    }
}