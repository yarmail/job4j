package ru.job4j.pojo;

import java.util.Date;

/**
 * new Date() - текущая дата
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasya");
        student.setGroup("2Б");
        student.setDate(new Date());
        System.out.println(student.getName() + " " + student.getGroup() + " " + student.getDate());
    }
}