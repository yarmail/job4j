package ru.job4j.tracker;

public class AddItem extends BaseAction {


    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Add new Order --------------");
        String name = input.ask("Please enter the name of the order: ");
        String desc = input.ask("Please enter the description of the order: ");
        long created = System.currentTimeMillis();
        Item item = new Item(name, desc, created);
        tracker.add(item);
        System.out.println("------------ New order with number: " + item.getId() + " created");
    }
}