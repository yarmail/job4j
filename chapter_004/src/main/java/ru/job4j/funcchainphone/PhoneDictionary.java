package ru.job4j.funcchainphone;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * В этой версии телефонного справочника
 * Функции высшего порядка
 * Цепочки предикатов
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей,
     * которые содержат key в любых полях
     *
     * @param key - ключ поиска
     * @return - список найденных пользователей
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> pred1 = i -> i.getAddress().contains(key);
        Predicate<Person> pred2 = i -> i.getName().contains(key);
        Predicate<Person> pred3 = i -> i.getPhone().contains(key);
        Predicate<Person> pred4 = i -> i.getSurname().contains(key);
        List<Predicate<Person>> predicates = Arrays.asList(pred1, pred2, pred3, pred4);

        return persons.stream()
                .filter(predicates.stream().reduce(i -> false, Predicate::or))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
