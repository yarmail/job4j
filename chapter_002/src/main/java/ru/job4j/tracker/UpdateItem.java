package ru.job4j.tracker;

public class UpdateItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Edit Order --------------");
        String id = input.ask("Please enter the ID of the order for edit");
        String name = input.ask("Please enter the new name of the order");
        String desc = input.ask("Please enter the new description of the order");
        long created = System.currentTimeMillis();
        Item item = new Item(name, desc, created);
        boolean result = tracker.replace(id, item);
        if (result) {
            System.out.println("------------ The order with number : " + item.getId() + " has been edited");
        }
        if (!result) {
            System.out.println("------------ Edit operation failed --------------");
        }
    }

    @Override
    public String info() {
        return "2. Edit order";
    }
}