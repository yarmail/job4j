package ru.job4j.indexemptycell;
import java.util.stream.IntStream;

/**
 * 1. Вам нужно написать метод,
 * который вернет индекс первой пустой ячейки.
 * (есть тесты)
 */
public class Shop {
    public static int indexOfNull(Product[] products) {
        return IntStream.range(0, products.length - 1)
                .filter(i -> products[i] == null)
                .findFirst()
                .orElse(-1);
    }
}
