package ru.job4j.tracker;

public class FindById implements UserAction {

    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find Order by ID --------------");
        String id = input.ask("Please enter the ID of the order for find: ");
        Item result = tracker.findById(id);
        if (result == null) {
            System.out.println("------------ Order not found --------------");
        }
        if (result != null) {
            System.out.println("Find Order Id: " + result.getId() + " Name: " + result.getName() + " Created: " + result.getTime());
        }
    }

    @Override
    public String info() {
        return "4. Find order by ID";
    }

}
