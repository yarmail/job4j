package ru.job4j.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 0. Map, HashMap [#212652]
 *
 * Создайте класс UsageMap
 * В классе создайте метод main
 * Внутри метода main создайте коллекцию HashMap<String, String>.
 * Добавьте туда почту в качестве ключа и фио в качестве значения.
 * Добавьте цикл for-each по ключу и выведите
 * на печать элементы коллекции.
 */
public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("pocta@pochta.ru", "FIO");
        for (String key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}