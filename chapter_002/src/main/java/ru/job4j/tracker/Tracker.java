package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Class Tracker is a wrapper over an array
 * Класс Трекер - это обертка над массивом
 * items = массив для хранения заявок
 * position = после выполнение add() - показывает количество заявок
 * ----------------------------
 *     old version
 *     private final Item[] items = new Item[100];
 */

public class Tracker {

    private final  List<Item> items = new ArrayList<>(100);
    private int position = 0;

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
     *
     * old version
     * this.items[this.position++] = item;
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(this.position++, item);
        return item;
    }

    /**
     * Search in array by id
     * Поиск ячейки в массиве по id
     *
     * old version
     * for (int i = 0; i < this.position; i++) {
     * if ((this.items[i] != null) && (this.items[i].getId()).equals(id)) {
     * result = items[i];
     * break;
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item:items) {
            if ((item != null) & (item.getId()).equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Find all completed applications from the total
     * Найти все заполненные заявки из общего объема
     *
     * old version
     * Item[] result = Arrays.copyOf(this.items, this.position);
     */
    public List<Item> findAll() {
        List<Item> result = new ArrayList<>(0);
        if (this.position != 0 & this.position != items.size() - 1) {
            result = items.subList(0, this.position);
        }
        if (this.position == items.size() - 1) {
            result = items;
        }
        return result;
    }

    /**
     * Search in array by name
     * Поиск в массиве по полю Name
     *
     * old version
     * int count = 0;
     * Item[] tmp = new Item[this.position];
     * for (int i = 0; i < this.position; i++) {
     * if ((this.items[i] != null) && (this.items[i].getName().equals(key))) {
     * tmp[count] = this.items[i];
     * count++;
     *  Item[] result = Arrays.copyOf(tmp, count);
     */
    public List<Item> findByName(String key) {

        List<Item> result = new ArrayList<>(0);
        for (Item item: items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Delete applications
     * Удаление заявок (находим заявку по id)
     *
     * old version
     * for (int i = 0; i < this.position; i++) {
     * if ((this.items[i] != null) && this.items[i].getId().equals(id)) {
     * System.arraycopy(this.items, (i + 1), this.items, i, this.position - (i + 1));
     * this.position--;
     * this.items[this.position] = null;
     * result = true;
     * break;
     */

    public boolean delete(String id) {
        boolean result = false;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                items.remove(item);
                this.position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Replace application
     * Редактирование (замена) заявки
     *
     * old version
     * for (int i = 0; i < this.position; i++) {
     * if (this.items[i].getId().equals(id)) {
     * items[i] = item;
     * item.setId(id);
     * result = true;
     * break;
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (Item i : this.items) {
            if (i.getId().equals(id)) {
                items.set(items.indexOf(i), item);
                result = true;
                break;
            }
        }
        return result;
    }
}