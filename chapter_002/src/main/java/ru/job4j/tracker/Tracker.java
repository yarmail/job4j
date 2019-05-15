package ru.job4j.tracker;

import java.util.Arrays;

/**
 * items = массив для хранения заявок
 * position = после выполнение add() - показывает количество заявок
 */

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    /**
     * Generating a unique key based on the current time and a random number
     * Генерируем уникальный ключ на основе текущего времени и случайного числа
     * <p>
     * Если генерация ключа нужна не чаще раза в секунду можно использовать:
     * 1) currentTimeMillis() (~13 знаков)
     * 2) Math.random (~ 4 знака)
     * 3) привести к общему типу long и сложить
     * 4) перевести в  String (в условиях дпнной задачи)
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
     * Add new application
     * Метод добавляет новую заявку в хранилище
     *
     * @param item новая заявка
     * @return возвращает заявку с параметрами
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Search in array by id
     * Поиск ячейки в массиве по id
     *
     * @param id
     * @return возвращает найденный Item
     * исправлено 15.05.2019
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i] != null) && (this.items[i].getId()).equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }

    /**
     * Getting a list of all applications
     * Получение списка всех заявок
     *
     * Предполагаю, что список заявок не содержит внутри себя нулевых элементов
     *
     * @return возвращает копию массива this.items без null элементов
     * c помощью System.arraycopy (указано в задании)
     * Andrei Hincu указал делать через Arrays.copyOf()
     * исправлено 15.05.2019
     */
    public Item[] findAll() {
        Item[] result = Arrays.copyOf(this.items, this.position);
        return result;
    }

    /**
     * Search in array by name
     * Поиск в массиве по полю Name
     * <p>
     * Вижу 2 варианта:
     * 1) (первый прогон) сначала посчитать счетчиком все совпадения,
     * сделать новый маленький массив и заново найти уже с копированием (второй прогон) - пока так и поступлю
     * 2) создать 2 одинаковых массива и копировать найденные значения -
     * мне кажется при больших массивах так будет нерационально использовать память.
     *
     * @param key
     * @return result массив у которых совпадает name.
     * (!!! Пока не понятно, оптимальный ли это способ)
     * Пока не очень понятно где и как здесь использовать Arrays.copyOf
     */
    public Item[] findByName(String key) {
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i] != null) && (this.items[i].getName().equals(key))) {
                count = count + 1;
            }
        }
        Item[] result = new Item[count];
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i] != null) && (this.items[i].getName().equals(key))) {
                for (int j = 0; j < count; j++) {
                    result[j] = this.items[i];
                }
            }
        }
        return result;
    }

    /**
     * Delete applications
     * Удаление заявок (находим заявку по id)
     *
     * result = результат операции удаления
     * Находим позицию нужной заявки через id
     * Не забываем изменить позицию при удалении
     * Исправлено 15.05.2019
     */

    public boolean delete(String id) {
        boolean result = false;
        if ((this.position == 0)
                && (this.items[this.position] != null)
                && this.items[this.position].getId().equals(id)) {
            this.items[this.position] = null;
            result = true;
        }
        if (this.position > 0) {
            for (int i = 0; i <= this.position; i++) {
                if ((this.items[i] != null) && this.items[i].getId().equals(id)) {
                    System.arraycopy(this.items, (i + 1), this.items, i, (this.position) - i);
                    this.items[this.position] = null;
                    this.position--;
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Replace application
     * Редактирование (замена) заявки
     * <p>
     * @param id (находим заявку по id)
     * @param item новая заявка, которая заменит найденную в хранилище
     * @return result насколько успешная операция
     * "и добавьте строку item.setId(id); чтобы перезаписать id если он выставлен ошибочно"
     * исправлено 15.05.2019
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
            for (int i = 0; i < this.position; i++) {
                if (this.items[i].getId().equals(id)) {
                    items[i] = item;
                    item.setId(id);
                    result = true;
                    break;
                }
            }
        return result;
    }
}