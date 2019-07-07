package ru.job4j.tracker;

public class FindByName extends BaseAction {

    public FindByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find Order by Name --------------");
        String name = input.ask("Please enter the Name of the order for find: ");
        Item[] result = tracker.findByName(name);
        if (result.length == 0) {
            System.out.println("------------ Order not found --------------");
        }
        if (result.length > 0) {
            for (Item el : result) {
                System.out.println("Id: " + el.getId() + " Name: " + el.getName() + " Created: " + el.getTime());
            }
        }
    }
}
