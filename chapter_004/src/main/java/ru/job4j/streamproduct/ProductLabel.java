package ru.job4j.streamproduct;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 0.2. Перенос методов в Stream API [#279131]
 * (есть тесты)
 */
public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
            return products.stream()
                    .filter(product -> product.getStandard() - product.getActual() >= 0)
                    .filter(product -> product.getStandard() - product.getActual() <= 3)
                    .map(product -> new Label(product.getName(), product.getPrice() * 0.5f))
                    .map(Label::toString)
                    .collect(Collectors.toList());
        }
}