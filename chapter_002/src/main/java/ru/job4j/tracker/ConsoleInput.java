package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Class ConsoleInput - interface implementation Input
 * Реализация интерфейса Input
 * System.in - консольный ввод?
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     *
     * Метод ask - Реализация интерфейса Input
     *
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();

    }

}
