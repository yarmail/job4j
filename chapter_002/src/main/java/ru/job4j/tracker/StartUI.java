package ru.job4j.tracker;

/**
 * Class StartUI entry point to the program
 * Класс StartUI точка входа в программу, т.е. должен иметь метод main.
 * Класс должен обеспечить полноценную работу всего приложения (трекера);
 *
 * Константы имеют номера пунктов меню
 *
 * private final Input input;// Получение данных от пользователя.
 * private final Tracker tracker;// Хранилище заявок.
 */

public class StartUI {
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";
    private final Input input;
    private final Tracker tracker;

    /**
     * Constructor class StartUI
     * Конструктор класса StartUI определяет,
     * что классом можно пользоваться используя интерфейс Input и Tracker
     * а также инициализирует переменные (поля) этих классов
     * @param input
     * @param tracker
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * The method shows a menu in the console.
     * Метод показывает меню в консоли
     */
    private void showMenu() {
        System.out.println("Menu");
        System.out.println("0. Add new order");
        System.out.println("1. Show all order");
        System.out.println("2. Edit order");
        System.out.println("3. Delete order");
        System.out.println("4. Find order by Id");
        System.out.println("5. Find order by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    /**
     * Create a new order, polling the user and put it in the repository
     * Создаем новый заказ, опрашивая пользователя и помещаем его в хранилище
     */
    private void createItem() {
        System.out.println("------------ Add new Order --------------");
        String name = this.input.ask("Please enter the name of the order");
        String desc = this.input.ask("Please enter the description of the order");
        long created = System.currentTimeMillis();
        Item item = new Item(name, desc, created);
        this.tracker.add(item);
        System.out.println("------------ New order with number : " + item.getId() + " created");
    }

    /**
     * Shows all found orders
     */
    private void showAllItem() {
        System.out.println("------------ List of all orders --------------");
        Item[] result = this.tracker.findAll();
        if (result.length == 0) {
            System.out.println("------------ Order not found --------------");
        }
        if (result.length > 0) {
            for (Item el : result) {
                System.out.println("Id: " + el.getId() + " Name: " + el.getName() + " Created: " + el.getTime());
            }
            System.out.println("------------ End of list orders --------------");
        }
    }

    /**
     * We interrogate the user and replace the order parameters
     * Опрашиваем пользователя и заменяем  параметры заказа
     */
    private void editItem() {
        System.out.println("------------ Edit Order --------------");
        String id = this.input.ask("Please enter the ID of the order for edit");
        String name = this.input.ask("Please enter the new name of the order");
        String desc = this.input.ask("Please enter the new description of the order");
        long created = System.currentTimeMillis();
        Item item = new Item(name, desc, created);
        boolean result = this.tracker.replace(id, item);
        if (result) {
            System.out.println("------------ The order with number : " + item.getId() + " has been edited");
        }
        if (!result) {
            System.out.println("------------ Edit operation failed --------------");
        }
    }

    /**
     * Запрашиваем id, если возможно, удаляем
     *
     */
    private void delete() {
        System.out.println("------------ Delete Order --------------");
        String id = this.input.ask("Please enter the ID of the order for delete");
        boolean result = tracker.delete(id);
        if (result) {
            System.out.println("------------ The delete operation was successful --------------");
        }
        if (!result) {
            System.out.println("------------ Delete operation failed --------------");
        }
    }

    /**
     * Поиск заказа по id
     */
    private void findById() {
        System.out.println("------------ Find Order by ID --------------");
        String id = this.input.ask("Please enter the ID of the order for find");
        Item result = tracker.findById(id);
        if (result == null) {
            System.out.println("------------ Order not found --------------");
        }
        if (result != null) {
            System.out.println("Find Order Id: " + result.getId() + " Name: " + result.getName() + " Created: " + result.getTime());
        }
    }

    /**
     * Find Order by Name
     * Поиск заказов по названию
     */
    private void findByName() {
        System.out.println("------------ Find Order by Name --------------");
        String name = this.input.ask("Please enter the Name of the order for find");
        Item[] result = tracker.findByName(name);
        if (result.length == 0) {
            System.out.println("------------ Order not found --------------");
        }
        if (result.length > 0) {
            for (Item el: result) {
                System.out.println("Id: " + el.getId() + " Name: " + el.getName() + " Created: " + el.getTime());
            }
        }
    }

    /**
     * The main cycle of the program
     * Основной цикл программы
     * (проверять условие - сначала константа, а потом переменная)
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Please select a menu item and press Enter: ");
            if (ADD.equals(answer)) {
                this.createItem();
            }
            if (SHOW.equals(answer)) {
                this.showAllItem();
            }
            if (EDIT.equals(answer)) {
                this.editItem();
            }
            if (DELETE.equals(answer)) {
                this.delete();
            }
            if (FINDBYID.equals(answer)) {
                this.findById();
            }
            if (FINDBYNAME.equals(answer)) {
                this.findByName();
            }
            if (EXIT.equals(answer)) {
                exit = true;
                System.out.println("------------ The program has completed --------------");
                break;
            }
        }
    }

    /**
     * Пока не очень понятно, как это понимать
     *
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
