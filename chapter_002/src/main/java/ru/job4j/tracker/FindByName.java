package ru.job4j.tracker;

public class FindByName implements UserAction {

    @Override
    public int key() {
        return 5;
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

    @Override
    public String info() {
        return "5. Find order by name";
    }
}
