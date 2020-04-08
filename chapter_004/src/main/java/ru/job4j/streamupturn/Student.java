package ru.job4j.streamupturn;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int scope;

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public int getScope() {
        return scope;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scope);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getScope(), this.getScope());
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", scope=" + scope
                + '}';
    }
}
