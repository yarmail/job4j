package ru.job4j.tracker;

import java.util.List;

public class ShowAllItem extends BaseAction {

    public ShowAllItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ List of all orders --------------");
        List<Item> result = tracker.findAll();
        if (result.size() == 0) {
            System.out.println("------------ Order not found --------------");
        }
        if (result.size() > 0) {
            for (Item el : result) {
                System.out.println("ID: " + el.getId() + " Name: " + el.getName() + " Created: " + el.getTime());
            }
            System.out.println("------------ End of list orders --------------");
        }
    }
}