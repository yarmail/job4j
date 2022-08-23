package ru.job4j.optionalemptyof;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * 3. Optional - empty, of [#214711]
 *
 * (есть тесты)
 */
public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * (в условии задачи исходный вариант метода)
     */
    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student student: students.keySet()) {
            if (account.equals(student.getAccount())) {
                rsl = Optional.of(student);
                break;
            }
        }
        return rsl;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject subject : subjects) {
                if (name.equals(subject.getName())) {
                    rsl = Optional.of(subject);
                    break;
                }
            }
        }
        return rsl;
    }
}