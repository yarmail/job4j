package ru.job4j.exception;

/**
 * 0.4. Пользовательские исключения. [#219367]
 *
 * Создаем свое исключение, которое будем
 * использовать в классе FindEl
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
