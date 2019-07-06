package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    /**
     * хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор 1
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Конструктор 2
     */
    public MenuTracker() {
    }


    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(0, new AddItem(0, "Add item"));
        this.actions.add(1, new ShowAllItem());
        this.actions.add(2, new UpdateItem());
        this.actions.add(3, new DeleteItem());
        this.actions.add(4, new FindById());
        this.actions.add(5, new FindByName());
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соответcтвующее действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Массив с числами пунктов меню
     * @return int[] array
     */

    public int[] range() {
        int[] range = new int[this.actions.size()];
        for (int i = 0; i < range.length; i++) {
            range[i] = i;
        }
        return range;
    }
}