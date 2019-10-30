package ru.job4j.tracker;

import java.util.List;

public class FindByName extends BaseAction {

    public FindByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find Order by Name --------------");
        String name = input.ask("Please enter the Name of the order for find: ");

        List<Item> result = tracker.findByName(name);
        if (result.size() == 0) {
            System.out.println("------------ Order not found --------------");
        }
        if (result.size() > 0) {
            for (Item el : result) {
                System.out.println("Id: " + el.getId() + " Name: " + el.getName() + " Created: " + el.getTime());
            }
        }
    }
}
