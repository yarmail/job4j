package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Delete Order --------------");
        String id = input.ask("Please enter the ID of the order for delete");
        boolean result = tracker.delete(id);
        if (result) {
            System.out.println("------------ The delete operation was successful --------------");
        }
        if (!result) {
            System.out.println("------------ Delete operation failed --------------");
        }
    }

    @Override
    public String info() {
        return "4. Delete Order";
    }

}
