package ru.job4j.tracker;

/**
 * items = массив для хранения заявок
 * position = указатель ячейки для новой заявки
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
     */
    public Item findById(String id) {
        Item result = null;
        for (Item el : this.items) {
            if ((el != null) && (el.getId()).equals(id)) {
                result = el;
                break;
            }
        }
        return result;
    }

    /**
     * Getting a list of all applications
     * Получение списка всех заявок
     * <p>
     * Предполагаю, что список заявок не содержит внутри себя нулевых элементов
     * Count показывает, сколько ненулевых элементов
     *
     * @return возвращает копию массива this.items без null элементов
     * c помощью System.arraycopy
     */
    public Item[] findAll() {
        int count = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                count = count + 1;
            }
            if (this.items[i] == null) {
                break;
            }
        }
        Item[] result = new Item[count];
        System.arraycopy(this.items, 0, result, 0, count);
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
     */
    public Item[] findByName(String key) {
        int count = 0;
        for (int i = 0; i < this.items.length; i++) {
            if ((this.items[i] != null) && (this.items[i].getName().equals(key))) {
                count = count + 1;
            }
        }
        Item[] result = new Item[count];
        for (int i = 0; i < this.items.length; i++) {
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
     * <p>
     * result = результат операции удаления
     * (!!!Пока предполагаем, что id существует и нормальное)
     * count = findAll().length; получаем общее количество ненулевых заявок
     * if (count != 0) // если в полученном списке есть заявки
     * Находим позицию нужной заявки через id
     * <p>
     * if (i! = count - 1)// если найденная заявка не последняя по индексу
     * Копируем массив влево с позиции i+1 на позицию i, ((count-1) - i) всего элементов
     * Присваиваем последней заявке null, т.к. она скопирована в предпоследнюю
     * Останавливаемся
     * <p>
     * if (i = count - 1)// если найденная заявка последняя по индексу
     * Присваиваем заявке null (просто "удаляем")
     * <p>
     * В обоих этих случаях result = true, в остальных - остается false
     */

    public boolean delete(String id) {
        boolean result = false;
        int count = findAll().length;
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                if (this.items[i].getId().equals(id)) {
                    if (i != count - 1) {
                        System.arraycopy(this.items, (i + 1), this.items, i, (count - 1) - i);
                        this.items[count - 1] = null;
                        result = true;
                        break;
                    }
                    if (i == count - 1) {
                        this.items[count - 1] = null;
                        result = true;
                    }
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
     * (!!!пока предполагаем, что входящие id и item существуют и нормальные)
     * <p>
     *  count = findAll().length; // число ненулевых заявок
     *  Если count не равно 0:
     *  Если объект найден по id - он заменяется в ячейке входящим
     *  Результат положительный. Прерывание
     *  Во всех остальных случаях результат остается отрицательным
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        int count = findAll().length;
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                if (this.items[i].getId().equals(id)) {
                    items[i] = item;
                    result = true;
                    break;
                }
            }

        }
        return result;
    }
}