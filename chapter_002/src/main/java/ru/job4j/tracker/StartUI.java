package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Class StartUI entry point to the program
 * Класс StartUI точка входа в программу, т.е. должен иметь метод main.
 * Класс должен обеспечить полноценную работу всего приложения (трекера);
 *
 * Константы имеют номера пунктов меню
 *
 * private final Input input;// Получение данных от пользователя.
 * private final Tracker tracker;// Хранилище заявок.
 *
 * В новой версии мы выводим данные в буфер с помощью Consumer
 * также, как мы делали с вводом (с помощью ConsoleInput и StubInput)
 */

public class StartUI {
    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker, this.output);
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
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker(), System.out::println).init();
    }
}