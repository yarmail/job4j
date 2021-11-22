package ru.job4j.indexemptycell;

/**
 * 3.2. Удаление моделей из массива. [#310016]
 * 1. Ниже приведен код класса ShopDrop с методом delete. Этот метод
 * должен сместить ячейки на одну позицию влево.
 * (тесты есть)
 */
public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static Product[] deleteAlternative(Product[] products, int index) {
        System.arraycopy(products, index + 1, products, index, products.length - 1 - index);
        products[products.length - 1] = null;
        return products;
    }
}