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
    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(input.ask("Select number: ", menu.range()));
        } while (!"y".equals(this.input.ask("Exit?(y/n): ")));
    }

    /**
     * Создаем новый объект StartUI  с консольным вводом и трекером
     * и запускаем метод init
     * ИНТЕРЕСНО СФОРМУЛИРОВАНО
     *
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}