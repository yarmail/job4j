package ru.job4j.mapstat;

import java.util.*;

/**
 * 4. Аттестация [#504878]
 * (есть тесты)
 */
public class AnalyzeByMap {

    /**
     * @return вычисляет общий средний балл
     * (среди всех учеников? - общая успеваемость?)
     */
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return count == 0 ? 0 : score / count;
    }

    /**
     * То есть берем одного ученика и считаем все его баллы
     * за все предметы и делим на количество предметов.
     * Возвращает список из объекта Label (имя ученика и средний балл).
     * @return вычисляет средний балл по каждому ученику.
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            if (count != 0) {
                Label label = new Label(pupil.name(), score / count);
                result.add(label);
            }
        }
        return result;
    }

    /**
     * Вычисляет средний балл по каждому предмету.
     * Например, собираем все баллы учеников по
     * предмету география и делим на количество учеников.
     * @return Возвращает список из объектов Label
     * (название предмета и средний балл).
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> maps = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                maps.merge(subject.name(), subject.score(), (oldVal, newVal) -> oldVal + newVal);
            }
        }
        for (String subject : maps.keySet()) {
            double score = maps.get(subject);
            Label label = new Label(subject, score / pupils.size());
            labels.add(label);
        }
        return labels;
    }

    /**
     * Возвращает лучшего ученика. Лучшим считается ученик
     * с наибольшим суммарным баллом по всем предметам.
     * @return Возвращает объект Label
     * (имя ученика и суммарный балл).
     */
    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> listPupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            Label label = new Label(pupil.name(), score);
            listPupil.add(label);
        }
        listPupil.sort(Comparator.naturalOrder());
        return listPupil.get(listPupil.size() - 1);
    }

    /**
     * Возвращает предмет с наибольшим баллом для всех студентов.
     * @return Возвращает объект Label (имя предмета,
     * сумма баллов каждого ученика по этому предмету).
     */
    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> maps = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                maps.merge(subject.name(), subject.score(), (oldVal, newVal) -> oldVal + newVal);
            }
        }
        for (String subject : maps.keySet()) {
            double score = maps.get(subject);
            Label label = new Label(subject, score);
            labels.add(label);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}