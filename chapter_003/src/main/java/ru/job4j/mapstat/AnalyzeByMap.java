package ru.job4j.mapstat;

import java.util.*;

/**
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
        if (count == 0) {
            return 0;
        }
        return score / count;
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
     * @param pupils
     * @return Возвращает список из объектов Label
     * (название предмета и средний балл).
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<String> listSubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String nameSubject = subject.name();
                listSubject.add(nameSubject);
            }
        }
        Collections.sort(listSubject);

        Map<String, Integer> mapSubjects = new HashMap<>();
        int count = 1;
        for (int i = 0; i < listSubject.size() - 1; i++) {
            if (listSubject.get(i + 1).equals(listSubject.get(i))) {
                count++;
            } else {
                mapSubjects.put(listSubject.get(i), count);
                count = 1;
            }
        }
        mapSubjects.put(listSubject.get(listSubject.size() - 1), count);

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : mapSubjects.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            double score = 0;
            for (Pupil pupil : pupils) {
                for (Subject subject : pupil.subjects()) {
                    if (key.equals(subject.name())) {
                        score += subject.score();
                    }
                }
            }
            Label label = new Label(key, score / value);
            result.add(label);
        }
        return result;
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
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> listSubjects = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String key = subject.name();
                int score = subject.score();
                if (map.containsKey(key)) {
                    score += map.get(key);
                }
                map.put(key, score);
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            Label label = new Label(key, value);
            listSubjects.add(label);
        }

        listSubjects.sort(Comparator.naturalOrder());
        return listSubjects.get(listSubjects.size() - 1);
    }
}