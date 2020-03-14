package ru.job4j.tracker;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Class Tracker is a wrapper over an array
 * Класс Трекер - это обертка над массивом
 * items = место для хранения заявок
 */

public class Tracker {

    private final  List<Item> items = new ArrayList<>(0);


    /**
     * Generating a unique key based on the current time and a random number
     * Генерируем уникальный ключ на основе текущего времени и случайного числа
     * <p>
     * Если генерация ключа нужна не чаще раза в секунду можно использовать:
     * 1) currentTimeMillis() (~13 знаков)
     * 2) Math.random (~ 4 знака)
     * 3) привести к общему типу long и сложить
     * 4) перевести в  String (в условиях данной задачи)
     *
     * @return String Id
     */
    private String generateId() {
        long unixTime = System.currentTimeMillis();
        long rnd = (long) Math.random() * 10000L;
        String result = Long.toString(unixTime + rnd);
        return result;
    }

    /**
     * Аdd method adds ids and adds new order to storage
     * Метод добавляет id и добавляет новую заявку в хранилище
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Search by id
     * Поиск по id
     */

/*
старая версия через коллекции
    public Item findById(String id) {
        Item result = null;
        for (Item item:items) {
            if ((item != null) && (item.getId()).equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
*/
    public Item findById(String id) {
        Item result = null;
        if (!this.items.isEmpty()) {
            result = this.items.stream()
                    .filter(item -> item.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }
        return result;
    }

    public List<Item> findAll() {
         return this.items;
    }

    /**
     * findByName
     */

/*
старая версия
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>(0);
        for (Item item: items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }
*/

    public List<Item> findByName(String key) {
        List<Item> result = Collections.emptyList();
        if (!this.items.isEmpty()) {
            result = this.items.stream()
                    .filter(item -> item.getName().equals(key))
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        }
        return result;
    }


    /**
     * Delete applications
     * Удаление заявок (находим заявку по id)
     */

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                items.remove(i);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Replace application
     * Редактирование (замена) заявки
     * Важно: при замене заявки заменить и её ID из новой
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                items.set(i, item);
                item.setId(id);
                result = true;
                break;
            }
        }
        return result;
    }
}