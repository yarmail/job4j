package ru.job4j.exception;

/**
 * 0.4. Пользовательские исключения. [#219367]
 *
 * Задание
 * 1. Создайте класс ru.job4j.ex.ElementNotFoundException.
 * Класс должен наследоваться от java.lang.Exception
 *
 * 2. Допишите метод поиска индекса элемента
 * в строковом массиве.
 *
 * 3. Если элемента нет, то нужно выкинуть
 * исключение ElementNotFoundException.
 * В сигнатуре метода объявить это исключение.
 *
 * 4. Добавьте метод main, и в нем вызовите
 * метод indexOf. В методе main используйте
 * конструкцию try-catch.
 *
 */
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length - 1; i++) {
            if (key.equals(value[i])) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] value = {"один", "два", "три"};
        String key = "четыре";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
Вывод:
ru.job4j.exception.ElementNotFoundException: Элемент не найден
*/